package kodlama.io.rentacar.business.concretes;

import kodlama.io.rentacar.business.abstracts.ModelService;
import kodlama.io.rentacar.business.dto.requests.create.CreateModelRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateModelRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateModelResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetAllModelResponse;
import kodlama.io.rentacar.business.dto.responses.get.GetModelResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateModelResponse;
import kodlama.io.rentacar.entities.Model;
import kodlama.io.rentacar.repository.ModelRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
    private final ModelRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<GetAllModelResponse> getAll() {
        List<Model> models = repository.findAll();
        List<GetAllModelResponse> response = models.stream()
                .map(model -> mapper.map(model, GetAllModelResponse.class)).toList();

        return response;
    }

    @Override
    public GetModelResponse getById(int id) {
        checkIfBrandExists(id);

        Model model = repository.findById(id).orElseThrow();
        GetModelResponse response = mapper.map(model,GetModelResponse.class);

        return response;
    }

    @Override
    public CreateModelResponse add(CreateModelRequest request) {
        Model model = mapper.map(request,Model.class);
        model.setId(0);
        repository.save(model);
        CreateModelResponse response = mapper.map(model,CreateModelResponse.class);

        return response;
    }

    @Override
    public UpdateModelResponse update(int id, UpdateModelRequest request) {
        checkIfBrandExists(id);

        Model model = mapper.map(request,Model.class);
        model.setId(id);
        repository.save(model);
        UpdateModelResponse updateModelResponse = mapper.map(model, UpdateModelResponse.class);

        return updateModelResponse;
    }

    @Override
    public void delete(int id) {
        checkIfBrandExists(id);
        repository.deleteById(id);
    }

    private void checkIfBrandExists(int id) {
        if (!repository.existsById(id)) throw new RuntimeException("No such a brand!");
    }
}

package kodlama.io.rentacar.business.concretes;


import kodlama.io.rentacar.business.abstracts.RoleService;
import kodlama.io.rentacar.business.dto.requests.create.CreateRoleRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateRoleRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateRoleResponse;
import kodlama.io.rentacar.business.dto.responses.get.Role.GetAllRolesResponse;
import kodlama.io.rentacar.business.dto.responses.get.Role.GetRoleResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateRoleResponse;
import kodlama.io.rentacar.entities.Role;
import kodlama.io.rentacar.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleManager implements RoleService {
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;
    @Override
    public List<GetAllRolesResponse> getAll() {
        List<Role> roles = roleRepository.findAll();
        List<GetAllRolesResponse> getAllRolesResponses = roles
                .stream()
                .map(role -> modelMapper.map(role, GetAllRolesResponse.class))
                .collect(Collectors.toList());

        return getAllRolesResponses;
    }

    @Override
    public GetRoleResponse getById(int id) {
        Role role = roleRepository.findById(id).orElseThrow();
        GetRoleResponse getRoleResponse = modelMapper.map(role, GetRoleResponse.class);

        return getRoleResponse;
    }

    @Override
    public CreateRoleResponse add(CreateRoleRequest createRoleRequest) {
        Role role = modelMapper.map(createRoleRequest, Role.class);
        role.setId(0);
        roleRepository.save(role);

        CreateRoleResponse updateRoleResponse = modelMapper.map(role, CreateRoleResponse.class);

        return updateRoleResponse;
    }

    @Override
    public UpdateRoleResponse update(UpdateRoleRequest updateRoleRequest) {
        Role role = modelMapper.map(updateRoleRequest, Role.class);
        role.setId(0);
        roleRepository.save(role);

        UpdateRoleResponse updateRoleResponse = modelMapper.map(role, UpdateRoleResponse.class);

        return updateRoleResponse;
    }

    @Override
    public void delete(int id) {
        roleRepository.deleteById(id);
    }
}

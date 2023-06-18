package kodlama.io.rentacar.business.abstracts;



import kodlama.io.rentacar.business.dto.requests.create.CreateRoleRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateRoleRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateRoleResponse;
import kodlama.io.rentacar.business.dto.responses.get.Role.GetAllRolesResponse;
import kodlama.io.rentacar.business.dto.responses.get.Role.GetRoleResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateRoleResponse;

import java.util.List;

public interface RoleService {
    List<GetAllRolesResponse> getAll();
    GetRoleResponse getById(int id);
    CreateRoleResponse add(CreateRoleRequest createRoleRequest);
    UpdateRoleResponse update(UpdateRoleRequest updateRoleRequest);
    void delete(int id);

}

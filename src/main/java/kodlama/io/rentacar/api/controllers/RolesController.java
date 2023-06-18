package kodlama.io.rentacar.api.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentacar.business.abstracts.RoleService;
import kodlama.io.rentacar.business.dto.requests.create.CreateRoleRequest;
import kodlama.io.rentacar.business.dto.requests.update.UpdateRoleRequest;
import kodlama.io.rentacar.business.dto.responses.create.CreateRoleResponse;
import kodlama.io.rentacar.business.dto.responses.get.Role.GetAllRolesResponse;
import kodlama.io.rentacar.business.dto.responses.get.Role.GetRoleResponse;
import kodlama.io.rentacar.business.dto.responses.update.UpdateRoleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/roles")
public class RolesController {
    private final RoleService roleService;

    @GetMapping()
    public List<GetAllRolesResponse> findAll(){
        return roleService.getAll();
    }
    @GetMapping("/{id}")
    public GetRoleResponse getById(@PathVariable("id") int id){
        return roleService.getById(id);
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CreateRoleResponse add(@Valid @RequestBody CreateRoleRequest createRoleRequest){
        return roleService.add(createRoleRequest);
    }
    @PutMapping()
    public UpdateRoleResponse update(@RequestBody UpdateRoleRequest updateRoleRequest){
        return roleService.update(updateRoleRequest);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        roleService.delete(id);
    }
}

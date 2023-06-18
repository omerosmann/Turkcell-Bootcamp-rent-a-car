package kodlama.io.rentacar.business.dto.responses.get.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetRoleResponse {
    private int id;
    private String roleName;
}

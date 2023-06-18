package kodlama.io.rentacar.business.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PasswordResponse {
    private String email;
    private String oldPassword;
    private String newPassword;
}

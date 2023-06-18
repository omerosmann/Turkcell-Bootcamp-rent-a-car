package kodlama.io.rentacar.business.dto.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PasswordRequest {
    private String email;
    private String oldPassword;
    private String newPassword;
}

package kodlama.io.rentacar.business.dto.requests.create;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import kodlama.io.rentacar.business.dto.requests.PaymentRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaymentRequest extends PaymentRequest {
    @NotNull
    @Min(value = 1)
    private double balence;
}

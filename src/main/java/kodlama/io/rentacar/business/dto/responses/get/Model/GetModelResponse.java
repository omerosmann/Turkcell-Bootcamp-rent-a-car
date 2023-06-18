package kodlama.io.rentacar.business.dto.responses.get.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetModelResponse {
    private int id;
    private int brandId;
    private String name;
}

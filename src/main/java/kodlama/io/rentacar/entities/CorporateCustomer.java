package kodlama.io.rentacar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="corporate_customers")
@PrimaryKeyJoinColumn(name="customer_id")
public class CorporateCustomer extends Customer{
    private String companyName;
    private String taxNumber;
}

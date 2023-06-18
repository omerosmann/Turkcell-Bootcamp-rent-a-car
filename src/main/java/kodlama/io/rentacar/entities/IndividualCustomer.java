package kodlama.io.rentacar.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="individual_customers")
@PrimaryKeyJoinColumn(name="customer_id")
public class IndividualCustomer extends Customer {
    private String firstName;
    private String lastName;
    private String nationalIdentity;
    private LocalDate dateOfBirth;
}

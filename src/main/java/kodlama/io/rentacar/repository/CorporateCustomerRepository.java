package kodlama.io.rentacar.repository;


import kodlama.io.rentacar.entities.CorporateCustomer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer,Integer> {
}

package kodlama.io.rentacar.repository;


import kodlama.io.rentacar.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}

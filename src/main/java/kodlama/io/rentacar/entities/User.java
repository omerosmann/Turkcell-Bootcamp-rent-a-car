package kodlama.io.rentacar.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String resetToken;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}

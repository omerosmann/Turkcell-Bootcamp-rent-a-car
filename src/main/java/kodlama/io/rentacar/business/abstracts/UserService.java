package kodlama.io.rentacar.business.abstracts;


import kodlama.io.rentacar.entities.User;

public interface UserService {
    User getByEmail(String email);
    User getByResetToken(String token);
    void add(User user);
}

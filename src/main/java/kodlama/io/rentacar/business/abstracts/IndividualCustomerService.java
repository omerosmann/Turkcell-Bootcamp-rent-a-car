package kodlama.io.rentacar.business.abstracts;



import kodlama.io.rentacar.business.dto.requests.AuthRequest;
import kodlama.io.rentacar.business.dto.requests.PasswordRequest;
import kodlama.io.rentacar.business.dto.requests.ResetPasswordRequest;
import kodlama.io.rentacar.business.dto.requests.TokenPasswordRequest;
import kodlama.io.rentacar.business.dto.requests.create.CreateIndividualCustomerRequest;
import kodlama.io.rentacar.business.dto.responses.AuthResponse;
import kodlama.io.rentacar.business.dto.responses.PasswordResponse;
import kodlama.io.rentacar.business.dto.responses.ResetPasswordResponse;
import kodlama.io.rentacar.business.dto.responses.TokenResetResponse;
import kodlama.io.rentacar.business.dto.responses.create.CreateIndividualCustomerResponse;
import kodlama.io.rentacar.business.dto.responses.get.IndividualCustomer.GetAllIndividualCustomerResponse;
import kodlama.io.rentacar.business.dto.responses.get.IndividualCustomer.GetIndividualCustomerResponse;

import java.util.List;

public interface IndividualCustomerService {
    public AuthResponse login(AuthRequest authRequest);
    public CreateIndividualCustomerResponse register(CreateIndividualCustomerRequest createIndividualCustomerRequest);
    public GetIndividualCustomerResponse getById(int id);
    public List<GetAllIndividualCustomerResponse> getAll();
    public void delete(int id);
    public PasswordResponse changePassword(PasswordRequest passwordRequest);
    public ResetPasswordResponse resetPassword(String token, TokenPasswordRequest createTokenPasswordRequest);
    public TokenResetResponse forgotPassword(ResetPasswordRequest createResetPasswordRequest);
}

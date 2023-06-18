package kodlama.io.rentacar.api.controllers;


import kodlama.io.rentacar.business.abstracts.IndividualCustomerService;
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
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/individualcustomers")
public class IndividualCustomersController {
    private final IndividualCustomerService individualCustomerService;

    public IndividualCustomersController(IndividualCustomerService individualCustomerService) {
        this.individualCustomerService = individualCustomerService;
    }
    @GetMapping()
    public List<GetAllIndividualCustomerResponse> findAll(){
        return individualCustomerService.getAll();
    }
    @GetMapping("/{id}")
    public GetIndividualCustomerResponse getById(@PathVariable("id") int id){
        return individualCustomerService.getById(id);
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public CreateIndividualCustomerResponse register(@RequestBody CreateIndividualCustomerRequest createIndividualCustomerRequest){
        return individualCustomerService.register(createIndividualCustomerRequest);
    }
    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest){
        return individualCustomerService.login(authRequest);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        individualCustomerService.delete(id);
    }
    @PostMapping("/changePassword")
    public PasswordResponse changePassword(
            @RequestBody PasswordRequest createPasswordRequest){
        return individualCustomerService.changePassword(createPasswordRequest);
    }
    @PostMapping("/forgotPassword")
    public TokenResetResponse forgotPassword(
            @RequestBody ResetPasswordRequest createResetPasswordRequest){
        return individualCustomerService.forgotPassword(createResetPasswordRequest);
    } @PutMapping("/resetPassword")
    public ResetPasswordResponse resetPassword(@RequestParam String token,
                                               @RequestBody TokenPasswordRequest createTokenPasswordRequest){
        return individualCustomerService.resetPassword(token, createTokenPasswordRequest);
    }
}

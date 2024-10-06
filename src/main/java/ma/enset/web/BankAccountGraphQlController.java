package ma.enset.web;

import ma.enset.dto.BankAccountRequestDTO;
import ma.enset.dto.BankAccountResponseDTO;
import ma.enset.entities.BankAccount;
import ma.enset.entities.Customer;
import ma.enset.repositories.BankAccountRepository;
import ma.enset.repositories.CustomerRepository;
import ma.enset.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Currency;
import java.util.List;

@Controller
public class BankAccountGraphQlController {
    @Autowired
    private BankAccountRepository bankAccountRepository;

    @Autowired
    private AccountService accountService;

    @Autowired
    private CustomerRepository customerRepository;

    @QueryMapping
    public List<BankAccount> accounts() {
        return bankAccountRepository.findAll();
    }

    @QueryMapping
    public BankAccount bankAccountById(@Argument String id) {
        return bankAccountRepository.findById(id).orElseThrow(
                () -> new RuntimeException(String.format("Account with ID %s not found", id))
        );
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount) {
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount) {
        return accountService.updateAccount(id, bankAccount);
    }


    @MutationMapping
    public Boolean deleteAccount(@Argument String id) {
        bankAccountRepository.deleteById(id);
        return true;
    }

    @QueryMapping
    public List<Customer> customers(){
        return customerRepository.findAll();
    }
}


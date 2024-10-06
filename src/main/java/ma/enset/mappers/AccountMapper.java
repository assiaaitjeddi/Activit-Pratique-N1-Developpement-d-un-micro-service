package ma.enset.mappers;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ma.enset.dto.BankAccountRequestDTO;
import ma.enset.dto.BankAccountResponseDTO;
import ma.enset.entities.BankAccount;
import ma.enset.repositories.BankAccountRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public BankAccountResponseDTO fromBankAccount(BankAccount bankAccount){
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount, bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}

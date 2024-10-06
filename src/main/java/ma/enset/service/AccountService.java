package ma.enset.service;

import ma.enset.dto.BankAccountRequestDTO;
import ma.enset.dto.BankAccountResponseDTO;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}


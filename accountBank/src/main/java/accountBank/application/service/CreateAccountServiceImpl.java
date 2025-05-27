package accountBank.application.service;

import accountBank.domain.model.AccountBank;
import accountBank.domain.port.input.CreateAccountService;
import accountBank.domain.port.output.AccountBankRepository;
import org.springframework.stereotype.Service;


@Service
public class CreateAccountServiceImpl implements CreateAccountService {

    private  final AccountBankRepository accountBankRepository;

    public CreateAccountServiceImpl(AccountBankRepository accountBankRepository){
        this.accountBankRepository = accountBankRepository;
    }

    @Override
    public AccountBank createAccountBank(AccountBank accountBank) {

        return accountBankRepository.save(accountBank);
    }
}

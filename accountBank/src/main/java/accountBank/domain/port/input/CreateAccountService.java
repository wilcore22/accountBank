package accountBank.domain.port.input;

import accountBank.domain.model.AccountBank;

public interface CreateAccountService {
    AccountBank createAccountBank(AccountBank accountBank);
}

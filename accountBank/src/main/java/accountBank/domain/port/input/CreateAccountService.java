package accountBank.domain.port.input;

import accountBank.domain.model.AccountBank;

public interface CreateAccountService {
    AccountBank createAccountBanck(AccountBank accountBank);
}

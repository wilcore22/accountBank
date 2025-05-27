package accountBank.domain.port.output;

import accountBank.domain.model.AccountBank;

public interface AccountBankRepository {
    AccountBank save(AccountBank accountBank);
}

package accountBank.infraestructure.persistence.repository;

import accountBank.domain.model.AccountBank;
import accountBank.domain.port.output.AccountBankRepository;
import accountBank.infraestructure.config.mapper.AccountBankMapper;
import accountBank.infraestructure.persistence.dao.AccountBankDao;
import accountBank.infraestructure.persistence.entities.AccountBankModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class AccountBankJpaRepository implements AccountBankRepository {

    private final AccountBankDao accountBankDao;
    private final AccountBankMapper accountBankMapper;

    @Override
    public AccountBank save(AccountBank accountBank) {
        AccountBankModel model = accountBankMapper.toModel(accountBank);
        AccountBankModel saved = accountBankDao.save(model);
        return accountBankMapper.toDomain(saved);
    }

}

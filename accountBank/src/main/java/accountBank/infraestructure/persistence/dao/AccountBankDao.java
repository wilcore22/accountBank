package accountBank.infraestructure.persistence.dao;


import accountBank.infraestructure.persistence.entities.AccountBankModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountBankDao  extends JpaRepository<AccountBankModel, Long> {
}

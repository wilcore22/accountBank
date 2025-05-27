package accountBank.infraestructure.config.mapper;


import accountBank.domain.model.AccountBank;
import accountBank.infraestructure.persistence.entities.AccountBankModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountBankMapper {
    AccountBankModel toModel(AccountBank domain);
    AccountBank toDomain(AccountBankModel model);
}

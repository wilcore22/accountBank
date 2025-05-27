package accountBank.infraestructure.config.mapper;


import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountBankMapper {
    TransactionsModel toModel(Transactions domain);
    Transactions toDomain(TransactionsModel model);
}

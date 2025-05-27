package accountBank.domain.model;


import jakarta.persistence.Column;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountBank {
    private Long id;
    private Integer accountBankId;
    @Column(precision = 10, scale = 2)
    private BigDecimal amount;
    private String nameProduct;
    private String typeAccount;
    private Date openingDate;
    private String statusAccount;
    private Integer ownerId;
    @Column(precision = 10, scale = 2)
    private BigDecimal interestRate;
    private String branchCode;

}

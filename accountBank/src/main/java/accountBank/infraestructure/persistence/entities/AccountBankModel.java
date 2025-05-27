package accountBank.infraestructure.persistence.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountBankModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "accountBankId")
    private Integer accountBankId;
    @Column(name = "amount",precision = 10, scale = 2)
    private BigDecimal amount;
    @Column(name = "nameProduct")
    private String nameProduct;
    @Column(name = "typeAccount")
    private String typeAccount;
    @Column(name = "openingDate")
    private Date openingDate;
    @Column(name = "statusAccount")
    private String statusAccount;

    @ManyToOne
    @JoinColumn(name = "ownerId", referencedColumnName = "clientId")
    private Cliente cliente;

    @Column(name = "interestRate",precision = 10, scale = 2)
    private BigDecimal interestRate;
    @Column(name = "branchCode")
    private String branchCode;
}

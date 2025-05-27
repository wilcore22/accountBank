package accountBank.infraestructure.persistence.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")  // Columna en snake_case
    private Integer clientId;     // Atributo en camelCase

    @Column(name = "document_type")
    private String documentType;

    @Column(name = "document_number", unique = true)
    private String documentNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "address")
    private String address;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "is_active")
    private Boolean isActive = true;
}

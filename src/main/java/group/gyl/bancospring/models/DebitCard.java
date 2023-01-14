package group.gyl.bancospring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DEBIT_CARD")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DebitCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cardNumber;
    private Integer securityCode;
    private String expirationDate;

    @Override
    public String toString() {
        return "DebitCard{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", securityCode=" + securityCode +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }
}

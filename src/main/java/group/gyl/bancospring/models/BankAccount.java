package group.gyl.bancospring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="BANKACCOUNT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double balance;
    private int cbu;
    private User user;
    private DebitCard debit;
    private static int cbuNumber = 1000;
}

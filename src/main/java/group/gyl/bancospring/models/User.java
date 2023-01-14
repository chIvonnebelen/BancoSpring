package group.gyl.bancospring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="USUARIOS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Integer dni;
    private Integer age;
    private String username;
    private String password;
    // private BankAccount account;
    private List<BankAccount> accounts = new ArrayList<BankAccount>();

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dni=" + dni +
                ", age=" + age +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}

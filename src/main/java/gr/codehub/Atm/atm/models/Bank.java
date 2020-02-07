package gr.codehub.Atm.atm.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bankId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "atm", referencedColumnName = "location")
    private Atm atm;

    @OneToMany(mappedBy = "bank")
    @JsonIgnore
    private List<Account> accounts;
}

package gr.codehub.Atm.atm.repositories;

import gr.codehub.Atm.atm.models.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Bank, String> {
}

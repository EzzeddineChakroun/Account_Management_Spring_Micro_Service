package tn.talan.compteservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.talan.compteservice.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte,Long> {

}

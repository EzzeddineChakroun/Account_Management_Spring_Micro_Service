package tn.talan.compteservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import tn.talan.compteservice.entities.Compte;
import tn.talan.compteservice.enums.TypeCompte;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte,Long> {
    @RestResource(path = "/byType")
    public List<Compte> findByType(@Param(value="type") TypeCompte typeCompte);
}

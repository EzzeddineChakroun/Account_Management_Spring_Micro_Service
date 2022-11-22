package tn.talan.compteservice.entities;

import org.springframework.data.rest.core.config.Projection;
import tn.talan.compteservice.enums.TypeCompte;

@Projection(name = "p2",types = Compte.class)
public interface CompteProj2 {
    double getSolde();
    TypeCompte getType();
}

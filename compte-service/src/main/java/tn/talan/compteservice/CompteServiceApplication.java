package tn.talan.compteservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import tn.talan.compteservice.entities.Compte;
import tn.talan.compteservice.enums.TypeCompte;
import tn.talan.compteservice.repositories.CompteRepository;

import java.util.Date;


@SpringBootApplication
public class CompteServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(CompteServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration){
        return args -> {
            restConfiguration.exposeIdsFor(Compte.class);
          compteRepository.save(new Compte(null,1500,new Date(), TypeCompte.COURANT));
          compteRepository.save(new Compte(null,6430,new Date(), TypeCompte.EPARGNE));
          compteRepository.save(new Compte(null,5460,new Date(), TypeCompte.COURANT));
          compteRepository.findAll().forEach(cp -> {
              System.out.println(cp.getType());
              System.out.println(cp.getSolde());
          });
        };
    }

}
package tn.talan.compteservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.talan.compteservice.dtos.VirementRequestDTO;
import tn.talan.compteservice.service.CompteService;

@RestController
public class AccountRestController {
    @Autowired
    private CompteService compteService;
    @PutMapping(path = "comptes/virement")
    public void virement(@RequestBody VirementRequestDTO request)
    {
        compteService.virement(request.getCodeSource(), request.getCodeDestination(), request.getMontant());
    }
}

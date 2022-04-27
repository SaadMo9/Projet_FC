package suptech.miage.projet_fc.personne.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import suptech.miage.projet_fc.personne.entitie.Personne;

import java.util.List;

public interface IPersonneService {

    Personne addPersonne(Personne personne) throws Exception;
    Personne updatePersonne(Personne personne) throws Exception;
    Personne deletePersonne(Personne personne) throws Exception;
    Personne getPersonnes(String ref) throws Exception;
    List<Personne> getPersonnes() throws Exception;
    List<Personne> getPersonnesByLabel(String label) throws Exception;

}

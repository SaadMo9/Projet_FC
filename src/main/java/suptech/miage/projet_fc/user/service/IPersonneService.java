package suptech.miage.projet_fc.user.service;

import suptech.miage.projet_fc.user.entitie.User;

import java.util.List;

public interface IPersonneService {

    User addPersonne(User personne) throws Exception;
    User updatePersonne(User personne) throws Exception;
    User deletePersonne(User personne) throws Exception;
    User getPersonnes(String ref) throws Exception;
    List<User> getPersonnes() throws Exception;
    List<User> getPersonnesByLabel(String label) throws Exception;

}

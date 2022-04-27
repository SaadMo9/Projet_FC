package suptech.miage.projet_fc.manager.service;

import suptech.miage.projet_fc.manager.entitie.Compte;
import suptech.miage.projet_fc.personne.entitie.Personne;

import java.util.List;

public interface ICompteService {

    Compte creationCompte(Compte compte) throws Exception;
    Compte modifierCompte(Compte compte) throws Exception;
    Compte connexion(String login,String password) throws Exception;
    Compte changerMDP(String login,String password) throws Exception;
    Compte MDPoublier(String login,String password) throws Exception;

    List<Compte> listCompte() throws Exception;
}

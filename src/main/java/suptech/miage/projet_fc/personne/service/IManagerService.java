package suptech.miage.projet_fc.personne.service;

import suptech.miage.projet_fc.manager.entitie.Compte;

public interface IManagerService extends IPersonneService{

    Compte bloqueCompte(int idCompte) throws Exception;
    Compte debloqueCompte(int idCompte) throws Exception;

}

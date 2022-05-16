package suptech.miage.projet_fc.user.service;

import suptech.miage.projet_fc.user.entitie.Manager;

public interface IManagerService extends IPersonneService{

    Manager bloqueCompte(int idCompte) throws Exception;
    Manager debloqueCompte(int idCompte) throws Exception;

}

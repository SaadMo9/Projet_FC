package suptech.miage.projet_fc.personne.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
    @Id @Column(length = 20)
    private int id ;
    private String nom ;
    private String prenom;
    private String date_naissance ;
    private String email ;
    private String num_telephone ;
    private String photo_profil ;
}

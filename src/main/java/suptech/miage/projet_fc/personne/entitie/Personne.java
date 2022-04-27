package suptech.miage.projet_fc.personne.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
    @Id  @GeneratedValue
    @Column(length = 20)
    private int id ;
    private String nom ;
    private String prenom;
    private Date date_naissance ;
    private String email ;
    private int num_telephone ;
    private String photo_profil ;
}

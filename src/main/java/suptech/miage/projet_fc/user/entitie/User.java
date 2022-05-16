package suptech.miage.projet_fc.user.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "Users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id  @GeneratedValue
    @Column(length = 20)
    private int id ;
    @Column(nullable = false)
    private String nom ;
    @Column(nullable = false)
    private String prenom;
    private Date date_naissance ;
    private String email ;
    @Column(nullable = false)
    private int num_telephone ;
    private String photo_profil ;
}

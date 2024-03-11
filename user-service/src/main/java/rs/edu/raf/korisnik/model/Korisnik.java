package rs.edu.raf.korisnik.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Korisnik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ime;

    private String prezime;

    private Long jmbg;

    private Long datumRodjenja;

    private String pol;

    private String email;

    private String brojTelefona;

    private String adresa;

    private String password;

    private String saltPassword;

    private String povezaniRacuni;

    private boolean aktivan;
}

package rs.edu.raf.korisnik.servis;

import rs.edu.raf.korisnik.dto.*;
import rs.edu.raf.korisnik.model.Korisnik;
import rs.edu.raf.korisnik.model.Radnik;
import rs.edu.raf.korisnik.model.SifrePlacanja;

import java.util.List;

public interface SifrePlacanjaServis {

    void init();
    SifrePlacanja findById(Long id);
    SifrePlacanja findByOblikAndOsnov(Integer oblikIOsnov);

}

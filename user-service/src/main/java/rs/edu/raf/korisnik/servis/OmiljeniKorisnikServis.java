package rs.edu.raf.korisnik.servis;

import rs.edu.raf.korisnik.dto.OmiljeniKorisnikDTO;

public interface OmiljeniKorisnikServis {

    void add(OmiljeniKorisnikDTO omiljeniKorisnikDTO);
    void edit(OmiljeniKorisnikDTO omiljeniKorisnikDTO);
    void delete(Long id);
    OmiljeniKorisnikDTO findById(Long id);

}

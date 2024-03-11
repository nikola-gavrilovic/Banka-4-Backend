package rs.edu.raf.korisnik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.edu.raf.korisnik.model.SifrePlacanja;

import java.util.List;

@Repository
public interface SifrePlacanjaRepository extends JpaRepository<SifrePlacanja, Long> {
//  void saveAll(List<SifrePlacanja> sifrePlacanja);
}

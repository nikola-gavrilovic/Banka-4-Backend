package rs.edu.raf.korisnik.servis.impl;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rs.edu.raf.korisnik.dto.SifrePlacanjaDTO;
import rs.edu.raf.korisnik.model.SifrePlacanja;
import rs.edu.raf.korisnik.repository.SifrePlacanjaRepository;
import rs.edu.raf.korisnik.servis.SifrePlacanjaMapper;
import rs.edu.raf.korisnik.servis.SifrePlacanjaServis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class SifrePlacanjaServisImpl implements SifrePlacanjaServis {

    @Autowired
    private SifrePlacanjaRepository sifrePlacanjaRepository;
    public static final List<SifrePlacanjaDTO> SIFRE_PLACANJA = new ArrayList<>();

    static {
        for(int i=120; i<=190; i++){
            SIFRE_PLACANJA.add(SifrePlacanjaDTO.builder()
                    .oblikIOsnov(Integer.valueOf(i))
                    .build());
        }
        for(int i=220; i<=290; i++){
            SIFRE_PLACANJA.add(SifrePlacanjaDTO.builder()
                    .oblikIOsnov(Integer.valueOf(i))
                    .build());
        }
        for(int i=320; i<=390; i++){
            SIFRE_PLACANJA.add(SifrePlacanjaDTO.builder()
                    .oblikIOsnov(Integer.valueOf(i))
                    .build());
        }
        for(int i=921; i<=990; i++){
            SIFRE_PLACANJA.add(SifrePlacanjaDTO.builder()
                    .oblikIOsnov(Integer.valueOf(i))
                    .build());
        }
    }

    @Override
    @Transactional
    @PostConstruct
    public void init() {
        List<SifrePlacanja> sifrePlacanja = new ArrayList<>();
        for(SifrePlacanjaDTO sifrePlacanjaDTO : SIFRE_PLACANJA){
            sifrePlacanja.add(SifrePlacanjaMapper.toEntity(sifrePlacanjaDTO));
        }
        sifrePlacanjaRepository.saveAll(sifrePlacanja);
    }

    //PROVERITI
    @Override
    public SifrePlacanja findById(Long id) {
        return null;
    }

    @Override
    public SifrePlacanja findByOblikAndOsnov(Integer oblikIOsnov) {
        return null;
    }
}

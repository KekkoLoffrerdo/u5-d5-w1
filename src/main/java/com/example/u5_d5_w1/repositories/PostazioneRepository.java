package com.example.u5_d5_w1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.u5_d5_w1.entities.Postazione;
import com.example.u5_d5_w1.entities.TipoPostazione;
import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {


    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);

}

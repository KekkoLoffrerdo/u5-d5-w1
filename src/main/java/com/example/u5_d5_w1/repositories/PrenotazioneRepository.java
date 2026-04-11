package com.example.u5_d5_w1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.u5_d5_w1.entities.Prenotazione;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {

    boolean existsByUtenteIdAndDataPrenotazione(Long utenteId, LocalDate dataPrenotazione);

    boolean existsByPostazioneIdAndDataPrenotazione(Long postazioneId, LocalDate dataPrenotazione);

    Optional<Prenotazione> findByUtenteIdAndDataPrenotazione(Long utenteId, LocalDate dataPrenotazione);
}
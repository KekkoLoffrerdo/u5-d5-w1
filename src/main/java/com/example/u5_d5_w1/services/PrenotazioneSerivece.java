package com.example.u5_d5_w1.services;

import com.example.u5_d5_w1.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

public class PrenotazioneSerivece {

    @Service
    public class PrenotazioneService {

        @Autowired
        private PrenotazioneRepository prenotazioneRepository;
        public void creaPrenotazione(Long utenteId, Long postazioneId, LocalDate data) {
            if (prenotazioneRepository.existsByPostazioneIdAndDataPrenotazione(postazioneId, data)) {
                throw new RuntimeException("Postazione già occupata");
            }
            if (prenotazioneRepository.existsByUtenteIdAndDataPrenotazione(utenteId, data)) {
                throw new RuntimeException("Utente già prenotato in questa data");
            }


        }
    }
}

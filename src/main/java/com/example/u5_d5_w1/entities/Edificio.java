package com.example.u5_d5_w1.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "edifici")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Edificio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String indirizzo;

    @Column(nullable = false)
    private String citta;

    public Edificio(String nome, String indirizzo, String citta) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }
}
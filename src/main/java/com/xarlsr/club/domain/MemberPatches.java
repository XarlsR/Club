package com.xarlsr.club.domain;

import jakarta.persistence.*;


import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "memberpatches")
public class MemberPatches implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mempatch_id", nullable = false, unique = true)
    private int mempatchId;

    @ManyToOne
    @JoinColumn(name = "id")
    private Member miembro;

    @ManyToOne
    @JoinColumn(name = "id")
    private Patch parche;

    @Column(name = "fecha_alta", nullable = false)
    private LocalDate fechaAlta;

    @Column(name = "fecha_baja")
    private LocalDate fechaBaja;

    @Column(name = "comentario", nullable = false)
    private String comentario;

    public int getMempatchId() {
        return mempatchId;
    }

    public void setMempatchId(int mempatchId) {
        this.mempatchId = mempatchId;
    }

    public Member getMiembro() {
        return miembro;
    }

    public void setMiembro(Member miembro) {
        this.miembro = miembro;
    }

    public Patch getParche() {
        return parche;
    }

    public void setParche(Patch parche) {
        this.parche = parche;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
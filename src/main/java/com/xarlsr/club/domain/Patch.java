package com.xarlsr.club.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "patches")
public class Patch implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Column(name = "patch_name", nullable = false, length = 25)
    private String patchName;

    @Column(name = "patch_alias", nullable = false, length = 3)
    private String patchAlias;

    @Column(name = "patch_rank", nullable = false)
    private int patchRank;

    public Patch() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatchName() {
        return patchName;
    }

    public void setPatchName(String patchName) {
        this.patchName = patchName;
    }

    public String getPatchAlias() {
        return patchAlias;
    }

    public void setPatchAlias(String patchAlias) {
        this.patchAlias = patchAlias;
    }

    public int getPatchRank() {
        return patchRank;
    }

    public void setPatchRank(int patchRank) {
        this.patchRank = patchRank;
    }
}
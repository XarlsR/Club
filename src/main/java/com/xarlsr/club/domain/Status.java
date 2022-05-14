package com.xarlsr.club.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "status")
public class Status implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id", nullable = false, unique = true)
    private int statusId;

    @Column(name = "stat_name")
    private String statName;

    @Column(name = "stat_alias")
    private String statAlias;

    @Column(name = "stat_active")
    private boolean statActive;

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }

    public String getStatAlias() {
        return statAlias;
    }

    public void setStatAlias(String statAlias) {
        this.statAlias = statAlias;
    }

    public boolean isStatActive() {
        return statActive;
    }

    public void setStatActive(boolean statActive) {
        this.statActive = statActive;
    }
}

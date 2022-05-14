package com.xarlsr.club.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "members")

public class Member implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer memberId;

    @Column(name = "memnumber", nullable = false, unique = true)
    private int memNumber;

    @Column(name = "name", nullable = false, length = 25)
    private String memName;

    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "nickname", unique = true, length = 25)
    private String nickname;

    @Column(name = "dni", nullable = false, unique = true, length = 9)
    private String dni;

    @Column(name = "joindate", nullable = false, length = 10)
    private LocalDate joinDate;

    @OneToOne(cascade = {CascadeType.ALL})
    @PrimaryKeyJoinColumn
    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public int getMemNumber() {
        return memNumber;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMemNumber(int memNumber) {
        this.memNumber = memNumber;
    }
}
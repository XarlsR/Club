package com.xarlsr.club.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name = "contacts")
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int contactId;

    @Column(name = "address1", length = 50)
    private String address1;

    @Column(name = "address2", length = 50)
    private String address2;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "province", nullable = false, length = 25)
    private String province;

    @Column(name = "post_code", length = 5)
    private String postCode;

    @Column(name = "country", nullable = false, length = 3)
    private String country;

    @Column(name = "telephone", unique = true, nullable = false, length = 15)
    private String telephone;

    @Column(name = "email", unique = true, nullable = false, length = 50)
    private String email;

    public Contact(){

    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

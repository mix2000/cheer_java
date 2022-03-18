package com.example.cheer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AthleteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String date_birthday;
    private String name;
    private String surname;
    private String second_name;
    private String email;
    private String phone;
    private Boolean athlete;
    private Boolean trainer;
    private Boolean archive;

    public AthleteEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate_birthday() {
        return date_birthday;
    }

    public void setDate_birthday(String date_birthday) {
        this.date_birthday = date_birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getAthlete() {
        return athlete;
    }

    public void setAthlete(Boolean athlete) {
        this.athlete = athlete;
    }

    public Boolean getTrainer() {
        return trainer;
    }

    public void setTrainer(Boolean trainer) {
        this.trainer = trainer;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}

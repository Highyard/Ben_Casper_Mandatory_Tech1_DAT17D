package com.example.demo.domains;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Child implements Serializable  {

public static final long serialVersionUID = 1L;

    private int id;
    private String forNavn;
    private String efterNavn;
    private String kontaktPerson;
    private String cpr;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private Date startDato;
    private String noter;

    public Child(){
    }

    public Child(int id, String forNavn, String efterNavn, String kontaktPerson, String cpr, Date startDato, String noter) {
        this.id = id;
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.kontaktPerson = kontaktPerson;
        this.cpr = cpr;
        this.startDato = startDato;
        this.noter = noter;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public void setEfterNavn(String efterNavn) {
        this.efterNavn = efterNavn;
    }

    public String getKontaktPerson() {
        return kontaktPerson;
    }

    public void setKontaktPerson(String kontaktPerson) {
        this.kontaktPerson = kontaktPerson;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public Date getStartDato() {

        return startDato;
    }

    public void setStartDato(Date startDato) {
        this.startDato = startDato;
    }

    public String getNoter() {
        return noter;
    }

    public void setNoter(String noter) {
        this.noter = noter;
    }



}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author tadija
 */
public class Knjiga implements Comparable<Knjiga>, Serializable {

    private String naslov;
    private String autor;
    private Zanr zanr;
    private String izdKuca;
    private int godina;
    private Image pozadina;

    private double prosecnaOcena = 0;
    private int brojOcena = 0;

    public Knjiga(String naslov, String autor, String izdKuca, int godina, Zanr zanr) {
        this.naslov = naslov;
        this.autor = autor;
        this.izdKuca = izdKuca;
        this.godina = godina;
        this.zanr = zanr;
    }

    public Knjiga(String naslov) {
        this.naslov = naslov;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Image getPozadina() {
        return pozadina;
    }

    public void setPozadina(Image pozadina) {
        this.pozadina = pozadina;
    }

    public void setZanr(Zanr zanr) {
        this.zanr = zanr;
    }

    public Zanr getZanr() {
        return zanr;
    }

    public String getIzdKuca() {
        return izdKuca;
    }

    public void setIzdKuca(String izdKuca) {
        this.izdKuca = izdKuca;
    }

    @Override
    public int compareTo(Knjiga o) {
        if (o.getProsecnaOcena() == prosecnaOcena) {
            return 0;
        } else if (o.getProsecnaOcena() < prosecnaOcena) {
            return -1;
        } else {
            return 1;
        }
    }

    private double getProsecnaOcena() {
        return prosecnaOcena;
    }
}

package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;

public class Jelo {
    String slika;
    String naziv;
    String opis;
    Kategorija kategorija;
    ArrayList<Sastojak>sastojci;
    int klVrednost;
    double cena;

    Jelo(){

    }

    public Jelo(String slika, String naziv, String opis, Kategorija kategorija, ArrayList<Sastojak> sastojci, int klVrednost, double cena) {
        this.slika = slika;
        this.naziv = naziv;
        this.opis = opis;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
        this.klVrednost = klVrednost;
        this.cena = cena;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Kategorija getKategorija(Kategorija k1) {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public ArrayList<Sastojak> getSastojci(ArrayList<Sastojak> sastojciZaCevape) {
        return sastojci;
    }

    public void setSastojci(ArrayList<Sastojak> sastojci) {
        this.sastojci = sastojci;
    }

    public int getKlVrednost() {
        return klVrednost;
    }

    public void setKlVrednost(int klVrednost) {
        this.klVrednost = klVrednost;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "slika='" + slika + '\'' +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", kategorija=" + kategorija +
                ", sastojci=" + sastojci +
                ", klVrednost=" + klVrednost +
                ", cena=" + cena +
                '}';
    }
}

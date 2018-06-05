package rs.aleph.android.example12.activities.model;

public class Sastojak {
    int id;
    String naziv;
    Jelo jelo;

    Sastojak(){

    }
    public Sastojak(int id, String naziv){
        this.id = id;
        this.naziv = naziv;
    }

    public Sastojak(int id, String naziv, Jelo jelo) {
        this.id = id;
        this.naziv = naziv;
        this.jelo = jelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo = jelo;
    }
}

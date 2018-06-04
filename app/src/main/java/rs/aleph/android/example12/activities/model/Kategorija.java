package rs.aleph.android.example12.activities.model;

import java.util.ArrayList;

public class Kategorija {
    int id;
    String naziv;
    Jelo jelo;

    Kategorija(){

    }

    public Kategorija(int id, String naziv, Jelo jelo) {
        this.id = id;
        this.naziv = naziv;
        this.jelo = jelo;
    }

    @Override
    public String toString() {
        return "Kategorija{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", jelo=" + jelo +
                '}';
    }
}

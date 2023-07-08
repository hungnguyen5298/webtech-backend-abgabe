package htwberlin.webtech.web;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Gewicht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int kilo;
    @Temporal(TemporalType.DATE)
    private Date datum;

    public Gewicht() {}

    public Gewicht(int id, int kilo, Date datum) {
        this.id = id;
        this.kilo = kilo;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Gewicht{" +
                "id=" + id +
                ", kilo = " + kilo +
                ", datum = " + datum +
                '}';
    }
}



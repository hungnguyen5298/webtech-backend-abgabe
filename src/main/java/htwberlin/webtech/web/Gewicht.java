package htwberlin.webtech.web;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Gewicht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double kilo;
    @Temporal(TemporalType.DATE)
    private Date datum;

    public Gewicht() {}

    public Gewicht(int id, double kilo, Date datum) {
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

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
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



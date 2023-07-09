package htwberlin.webtech.web;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ZielGewicht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double zielKilo;

    public ZielGewicht() {}

    public ZielGewicht(int id, double zielKilo) {
        this.id = id;
        this.zielKilo = zielKilo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getZielkilo() {
        return zielKilo;
    }

    public void setZielKilo(double zielKilo) {
        this.zielKilo = zielKilo;
    }

    @Override
    public String toString() {
        return "Zielgewicht{" +
                "id=" + id +
                ", kilo = " + zielKilo +
                '}';
    }
}



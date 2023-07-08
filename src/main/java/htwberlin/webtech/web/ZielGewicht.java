package htwberlin.webtech.web;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ZielGewicht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int kilo;

    public ZielGewicht() {}

    public ZielGewicht(int id, int kilo) {
        this.id = id;
        this.kilo = kilo;
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

    @Override
    public String toString() {
        return "Zielgewicht{" +
                "id=" + id +
                ", kilo = " + kilo +
                '}';
    }
}



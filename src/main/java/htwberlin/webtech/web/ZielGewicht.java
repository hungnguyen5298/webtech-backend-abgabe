package htwberlin.webtech.web;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ZielGewicht {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double zielKilo;

    public ZielGewicht() {}

    public ZielGewicht(Long id, double zielKilo) {
        this.id = id;
        this.zielKilo = zielKilo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getZielKilo() {
        return zielKilo;
    }

    public void setZielKilo(double zielKilo) {
        this.zielKilo = zielKilo;
    }

    @Override
    public String toString() {
        return "Zielgewicht{" +
                "id=" + id +
                ", Zielkilo=" + zielKilo +
                '}';
    }
}



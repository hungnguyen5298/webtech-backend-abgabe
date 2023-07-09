package htwberlin.webtech;

import htwberlin.webtech.web.Gewicht;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class GewichtTest {

    @Test
    void testToString() {

        Long id = 42L;
        double kilo = 89.0;
        Date date = new Date(2023,07,20);

        Gewicht gewicht = new Gewicht(id, kilo, date);

        String expectedToString = "Gewicht{id=42, kilo=89.0, datum=" + date.toString() + "}";
        String actualToString = gewicht.toString();

        assertEquals(expectedToString, actualToString);
    }
}

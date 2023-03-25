import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KontaktTest {

    @Test
    public void testSetter() {
        Kontakt test1 = new Kontakt("TestName", "TestVorname", "02331/9323-421");
        test1.setName("NeuerName");
        test1.setVorname(null);
        test1.setTelefonnummer("02391/4214-421");
        boolean wert = false;
        if (test1.getName() != null) {
            wert = true;
        }
        assertEquals(true, wert);

        if (test1.getVorname() != null) {
            wert = true;
        }
        assertEquals(true, wert);

        if (test1.getTelefonnummer() != null) {
            wert = true;
        }
        assertEquals(true, wert);
    }

    @Test
    public void testKonstruktor() {
        Kontakt test1 = new Kontakt("TestName", "TestVorname", "02331/9323-421");
        boolean wert = false;
        if (test1.getName() != null) {
            wert = true;
        }
        assertEquals(true, wert);

        if (test1.getVorname() != null) {
            wert = true;
        }
        assertEquals(true, wert);

        if (test1.getTelefonnummer() != null) {
            wert = true;
        }
        assertEquals(true, wert);
    }

}

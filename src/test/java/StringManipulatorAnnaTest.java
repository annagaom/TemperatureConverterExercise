import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringManipulatorAnnaTest {

    private StringManipulatorAnna manipulator;

    // Tämä metodi suoritetaan kerran ennen kaikkia testejä
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass: Resurssit alustettu ennen kaikkia testejä.");
    }

    // Tämä metodi suoritetaan kerran kaikkien testien jälkeen
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AfterClass: Resurssit vapautettu kaikkien testien jälkeen.");
    }

    // Tämä metodi suoritetaan ennen jokaista yksittäistä testiä
    @Before
    public void setUp() throws Exception {
        manipulator = new StringManipulatorAnna();
        System.out.println("Before: Resurssit alustettu ennen yksittäistä testiä.");
    }

    // Tämä metodi suoritetaan jokaisen yksittäisen testin jälkeen
    @After
    public void tearDown() throws Exception {
        System.out.println("After: Resurssit vapautettu yksittäisen testin jälkeen.");
    }

    // Testaa reverse-metodia
    @Test
    public void testReverse() {
        System.out.println("Testataan reverse-metodia.");
        String input = "hello";
        String expected = "olleh";
        String result = manipulator.reverse(input);
        assertEquals(expected, result);
    }

    // Testaa reverse-metodia tyhjällä merkkijonolla
    @Test
    public void testReverseEmpty() {
        System.out.println("Testataan reverse-metodia tyhjällä merkkijonolla.");
        String input = "";
        String expected = "";
        String result = manipulator.reverse(input);
        assertEquals(expected, result);
    }

    // Testaa capitalize-metodia
    @Test
    public void testCapitalize() {
        System.out.println("Testataan capitalize-metodia.");
        String input = "hello world";
        String expected = "Hello World";
        String result = manipulator.capitalize(input);
        assertEquals(expected, result);
    }

    // Testaa capitalize-metodia tyhjällä merkkijonolla
    @Test
    public void testCapitalizeEmpty() {
        System.out.println("Testataan capitalize-metodia tyhjällä merkkijonolla.");
        String input = "";
        String expected = "";
        String result = manipulator.capitalize(input);
        assertEquals(expected, result);
    }
}

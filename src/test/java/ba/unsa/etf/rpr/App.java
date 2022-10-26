package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Unit test for simple App.
 */
public class App
{
    public static void main(String[] args) {
        System.out.println("Unesi neki broj: ");
        Integer unos = Integer.parseInt(args[0]);
        System.out.println("ba.unsa.etf.rpr.Faktorijel: ");
        Faktorijel f = new Faktorijel();
        System.out.println(f.dajfaktorijel(unos));
        System.out.println("ba.unsa.etf.rpr.Faktorijel.Sinus broja " + unos + " je: ");
        Sinus s = new Sinus();
        System.out.println(s.dajSinus(unos));

    }

    }
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}

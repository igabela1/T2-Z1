package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Sinus {
    private double s;
    public double dajSinus(int n)
    {
        double s1=0;
        int stepen=n;
        int fakt=1;
        for(int i=0;i<5;i++)
        {
            s = s + ((double) stepen)/fakt;
            stepen = stepen * (-1) * n *n;
            fakt = fakt * (2*(i+1))*(2*(i+1)+1);
        }
        return s1;
    }
}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}

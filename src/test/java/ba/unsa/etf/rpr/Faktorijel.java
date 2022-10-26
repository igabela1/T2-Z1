package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Faktorijel {
    private int f;

    public Faktorijel() {
        f=1;
    }

    public int dajfaktorijel(int n)
    {
        int f=1;
        for(int i=2;i<=n;i++)
        {
            f= f * i;
        }
        return f;
    }

    public static class Sinus {
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
}
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}


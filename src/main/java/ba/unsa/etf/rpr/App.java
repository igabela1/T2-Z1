package ba.unsa.etf.rpr;
public class App {
    public static void main(String[] args) {
        System.out.println("Unesi neki broj: ");
        Integer unos = Integer.parseInt(args[0]);
        System.out.println("Faktorijel: ");
        Faktorijel f = new Faktorijel();
        System.out.println(f.dajfaktorijel(unos));
        System.out.println("Sinus broja " + unos + " je: ");
        Sinus s = new Sinus();
        System.out.println(s.dajSinus(unos));

    }
}


/**
 * ...
 **/
public class Koszontes {
    /**
     * ...
     **/
    public static String koszontes(String nev, String nyelv) {
        if (nyelv.equalsIgnoreCase("magyar")) {
            System.out.println("Szia " + nev);
        } else if (nyelv.equalsIgnoreCase("német")) {
            System.out.println("Tschüs " + nev);
        } else if (nyelv.equalsIgnoreCase("angol")) {
            System.out.println("Hello " + nev);
        } else {
            System.out.println("Hiba!");
        }
        return nev + "" + nyelv;
    }
}

import java.util.Scanner;

/**
 * ...
 **/
public class Main {
    /**
     * ...
     **/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Neved: ");
        String nev = in.nextLine();
        System.out.println("Nyelved: ");
        String nyelv = in.nextLine();
        Koszontes.koszontes(nev, nyelv);
    }
}

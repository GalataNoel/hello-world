import java.util.Scanner;

public class Koszontes {
    public static void koszontes(){
        Scanner in = new Scanner(System.in);
        System.out.println("Neved: ");
        String nev = in.nextLine();
        System.out.println("Nyelved: ");
        String nyelv = in.nextLine();

        if(nyelv.equalsIgnoreCase("magyar")){
            System.out.println("Szia "+nev);
        }else if(nyelv.equalsIgnoreCase("német")){
            System.out.println("Tschüs "+nev);
        }else if(nyelv.equalsIgnoreCase("angol")){
            System.out.println("Hello "+nev);
        }else
            System.out.println("Hiba!");
    }
}

import java.util.Random;
import java.util.Scanner;

public class Zagadajka {
    public static void main (String[]args){
        Random r = new Random();
        int a = r.nextInt( 100)+1;
        System.out.println("Vvidite chislo ot 1 do 100");
        int b = 1;
        do{
            Scanner scanner = new Scanner(System.in);
            b =Integer.valueOf(scanner.nextLine());
            if (b<a){
                System.out.println("Boljshe");
            }
            if (b>a){
                System.out.println("Menjshe");
            }
            if (b==a){
                System.out.println("Ravno");
            }
        }while (b!=a);


    }
}

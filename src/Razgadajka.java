import java.util.Random;
import java.util.Scanner;

public class Razgadajka {
    public static void main (String[]args){
        Random r = new Random();
        int a = r.nextInt( 100)+1;
        String b = "Ravno";
        do{
            System.out.println(a);
            Scanner scanner = new Scanner(System.in);
            b= scanner.nextLine();
            if (b.equals("Ravno")){
                System.out.println("Ugodal");
            }
            if (b.equals("Boljshe")){
                a = r.nextInt(100-a)+a;
            }
            if (b.equals("Menjshe")){
                a= r.nextInt(a);
            }

        }while (!b.equals("Ravno"));
    }
}

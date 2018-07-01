import java.util.Scanner;

public class DiapazonChisel {
    public static void main(String[]args){
        System.out.println("Vvide dva chisla");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        if (a<b){
            int n=a;
            while (n<=b){
                System.out.println(n);
                n++;
            }

        }
    }
}

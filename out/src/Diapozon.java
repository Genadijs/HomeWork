import java.util.Scanner;

public class Diapozon {
    public static void main(String[]args){
        System.out.println("Vvidite dva chisla");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        if (a<b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
}

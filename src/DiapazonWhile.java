import java.util.Scanner;

public class DiapazonWhile {
    public static void main(String[] args) {
        System.out.println("Vvidite dva chisla");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        if (a < b) {
            int i = a;
            while (i <= b){
                System.out.println(i);
                i++;
            }
        }
    }
}
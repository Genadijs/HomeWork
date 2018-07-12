import java.util.Scanner;

public class BolsheMenjsheRavno {
    public static void main(String[] args) {
        System.out.println("Vvidite chislo");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        if (n < 0){
            System.out.println("Chislo Otricateljnoe");
        }
        if (n == 0){
            System.out.println("Chislo ravno 0");
        }
        if (n>0) {
            System.out.println("Chislo Poloziteljnoe");
        }
    }
}

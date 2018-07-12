import java.util.Scanner;

public class Diskriminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int someInt1 = Integer.valueOf(scanner.nextLine());
        int someInt2 = Integer.valueOf(scanner.nextLine());
        int someInt3 = Integer.valueOf(scanner.nextLine());
        int D = (someInt2 * someInt2 - 4 * someInt1 * someInt3);
        System.out.println(D);
        if (D >= 0) {
            double x1 = (-someInt2 + Math.sqrt(someInt2 * someInt2 - 4 * someInt1 * someInt3)) / (2 * someInt1);
            double x2 = (-someInt2 - Math.sqrt(someInt2 * someInt2 - 4 * someInt1 * someInt3)) / (2 * someInt1);
            System.out.println(x1);
            System.out.println(x2);
        } else {
            System.out.println("kornej net");
        }


    }
}

import java.util.Scanner;

public class NaiboljwoeIzDvuh {
    public static void main(String[] args) {
        System.out.println("Tri chisla");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        int c = Integer.valueOf(scanner.nextLine());
        if ((a == b) && (b == c)) {
            System.out.println("a==b==c");
        }
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}

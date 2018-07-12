import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int someInt = Integer.valueOf(scanner.nextLine());
        System.out.println(someInt);

        int someInt2 = Integer.valueOf(scanner.nextLine());
        System.out.println(someInt + someInt2);
        System.out.println(someInt2 * someInt2);
    }
}

import java.util.Scanner;

public class ChetnieChisla {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        if (a<b){
            for (int i = a; i <= b; i++){
                if((i % 2) == 0){
                    System.out.println(i);
                }
            }
        }
    }
}

import java.util.Scanner;

public class SummaChisel {
    public static void main(String [] args){
        System.out.println("Vvide dva chisla");
        Scanner scanner = new Scanner(System.in);
        int a = Integer.valueOf(scanner.nextLine());
        int b = Integer.valueOf(scanner.nextLine());
        if (a<b){
            int summa = 0;
            for (int i=a; i<=b ; i++){
                summa = summa+i;
            }
            System.out.println(summa);
        }else{
            System.out.println("Chislo boljshe vtorogo");
        }
    }
}

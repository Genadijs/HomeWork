import java.util.Random;

public class SluchajnoeChislo {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(101);
        int b = r.nextInt(101);
        int c = r.nextInt(101);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);
    }
}

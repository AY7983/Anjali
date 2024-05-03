import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        String name = sc.nextLine();
        System.out.print(name);

        int num = sc.nextInt();
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);

        double dou = sc.nextDouble();
        System.out.println(dou);

        boolean bol = sc.nextBoolean();
        System.out.println(bol);

        short a = sc.nextShort();
        System.out.println(a);

        long large = sc.nextLong();
        System.out.println(large);
    }
}

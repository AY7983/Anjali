import java.util.Scanner;

public class Productinput {
    public static void main(String[] args) {
        Scanner product = new Scanner(System.in);
        System.out.println("Enter the value of firstno. :");
        int a = product.nextInt();
        System.out.println("Enter the value of secondno. :");
        int b = product.nextInt();
        int multiplication = a*b;
        System.out.println("The multiplication is : "+multiplication);
    }
}

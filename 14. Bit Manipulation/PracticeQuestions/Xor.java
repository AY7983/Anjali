import java.util.Scanner;

public class Xor{
    public static void main(String[] args) {
        System.out.println("Enter your number :");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(no ^ no);
    }
}
import java.util.Scanner;
import java.math.*;

public class Palindrome {

    static void checkPalindrome(int n) {
        int myNum = n;
        int pow = 0;
        int rev = 0;
        while (n > 0) {
            int last = n % 10;
            rev = last + (rev * 10);
            pow++;
            n = n / 10;
        }
        if (myNum == rev) {
            System.out.println(myNum + " is Palindrome");
        }if(myNum != rev) {
            System.out.println(myNum + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int pal = sc.nextInt();
        checkPalindrome(pal);
    }
}

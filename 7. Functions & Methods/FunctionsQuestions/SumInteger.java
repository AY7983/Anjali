import java.util.Scanner;

public class SumInteger {

    static void sumInteger(int digit){
        int sum = 0;
        int last ;
        while(digit > 0){
            last = digit%10;
            sum += last;
            digit = digit/10;
        }
        System.out.println("The sum of digit is : "+sum );
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer : ");
    int dig_it = sc.nextInt();
    sumInteger(dig_it);
   } 
}

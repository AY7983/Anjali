import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any num : ");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.print("num is prime");
        } else {
            boolean isPrime = true;
            // for (int i = 2; i <= num-1; i++) 
            for(int i = 2; i <= Math.sqrt(num); i++){
                if (num % i == 0) { // num is a multiple of i(i not equal to 1 or n);
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("num is prime");
            } else {
                System.out.println("num is not a prime");
            }

        }
    }
}

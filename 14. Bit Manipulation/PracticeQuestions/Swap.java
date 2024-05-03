 import java.util.Scanner;
 public class Swap{

public static int swapOfTwo(int num1 , int num2){
   System.out.println("Before swap: num1 = " + num1 + " , num2 = " + num2);

   num1 = num1 ^ num2;
   num2 = num1 ^ num2;
   num1 = num1 ^ num2;
  
   System.out.println("After swap: num1 = " + num1 + " , num2 = "+num2);
   return 0;

}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num1 :");
        int num1 = sc.nextInt();
        System.out.print("Enter your num2 :");
        int num2 = sc.nextInt();
        System.out.println(swapOfTwo(num1,num2));
    }
}
 

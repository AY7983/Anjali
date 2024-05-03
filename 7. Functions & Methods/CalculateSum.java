import java.util.Scanner;
public class CalculateSum {

    // public static void CalculateSum(int a , int b){
    //     System.out.println(a+ "+"+b+"="+(a+b));
    //     return ;
    // }
     public static int CalculateSum(int num1 , int num2){  //parameters or Formal Parameters
         int sum = num1+num2;
         return sum;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first no.");
            int a = sc.nextInt();
            System.out.println("Enter the second no.");
            int b = sc.nextInt();
            int sum = CalculateSum(a,b);      //arguments or actual parameters  
            System.out.println("sum is "+sum);
    }
}

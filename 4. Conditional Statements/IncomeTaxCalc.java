import java.util.Scanner;
public class IncomeTaxCalc {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Income :");
    int income = sc.nextInt();
     float tax = 0;
     if(income < 500000){
        tax = (income)*(0.0f);
        System.out.println("Taxable Amount is : "+tax);
     }
     else if(income > 500000  &&  income < 1000000){
            tax = income*0.2f;
            System.out.println("Taxable Amount is : "+tax);
        }
    else{
        tax = income*0.3f;
        System.out.println("Taxable Amount is :"+tax);
    }

     }
   } 


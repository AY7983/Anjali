import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firstno. : ");
        int A = sc.nextInt();
        System.out.print("Enter the secondno. ");
        int B = sc.nextInt();
        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' :
               System.out.println("A + B is :"+(A+B));
               break;
            case '-' :
               System.out.println("A - B is :"+(A-B));
               break;
            case '*' :
               System.out.println("A * B is :"+(A*B));
               break;
            case '/' :
               System.out.println("A / B is :"+(A/B));
               break;
            case '%' :
               System.out.println("A % B is :"+(A%B));
               break;
            default  :
               System.out.println("Wrong Input");

        }
        
    }
}

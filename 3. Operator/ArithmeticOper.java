public class ArithmeticOper{
    public static void main(String[] args) {

        // Arithmetic Binary Operator
        int A = 10;
        int B = 5;
        System.out.println("Add = "+(A+B));
        System.out.println("Difference = "+ (A-B));
        System.out.println("Multiplication = "+(A*B));
        System.out.println("Division = "+(A/B));
        System.out.println("Modulo(remainder) = "+(A%B));

        // Arithmetic Unary Operator
        
        int a =12;
        System.out.println(a);
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        int c = ++a;
        System.out.println(c);
        System.out.println(a);

        int a1=2;
        System.out.println(a1);
        int b1=a1--;
        System.out.println(b1);
        System.out.println(a1);
        b1=--a1;
        System.out.println(b1);
        System.out.println(a1);

    

    }
}
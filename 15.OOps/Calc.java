public class Calc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)4.5,(float)6.4));
        System.out.println(calc.sum(4.5f,6.4f));
        System.out.println(calc.sum(4,5,6));
    }
}
class Calculator{
   int sum(int a, int b){
    return a+b;
   }
   float sum(float a , float b){
    return a+b;
   }
   int sum(int a , int b , int c){
    return a+b+c;
   }
}

public class Fib {

    //Calculate nth term in fibonacci
    public static int fibonacci(int n){

        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fibonacci(n-1);  //1
        int fnm2 = fibonacci(n-2);  //2
        int Fn = fnm1 + fnm2; 

        return Fn;

    }
   public static void main(String[] args) {
    System.out.println("The fibonacci no. is " +fibonacci(23));
    System.out.println("The fibonacci no. is " +fibonacci(24));
    System.out.println("The fibonacci no. is " +fibonacci(25));
    System.out.println("The fibonacci no. is " +fibonacci(26));
    System.out.println("The fibonacci no. is " +fibonacci(28));
    System.out.println("The fibonacci no. is " +fibonacci(29));
    System.out.println("The fibonacci no. is " +fibonacci(30));


   } 
}

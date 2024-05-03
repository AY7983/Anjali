public class Factorial {
    public static int Factorial(int n){
        int f = 1; 

        for(int i = 1; i <= n ; i++){
          f = f*i;
        }
        return f; //factorial of n
    }
    public static void main(String[] args) {
        // int fact = Factorial(5);
        // System.out.println("Factorial is : "+fact);
        System.out.println("factorial is : "+Factorial(7));
    }
}

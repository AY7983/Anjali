public class FunctionOverloading {
    
    // fun to calaulate sum of 2 nums
    public static int Sum(int a , int b){
      return a + b;
    }
    // fun to calculate sum of 3 nums
    public static int Sum(int a , int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println("The Sum of 2 no. is : "+Sum(3,5));
        System.out.println("The Sum of 3 no. is : "+Sum(3,4,5));
    }
}

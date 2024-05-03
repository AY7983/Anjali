public class FunctionOverloadingDTypes {
    
    // fun to cal int sum
    public static int sum(int a , int b){
        return a + b;
    }

    // fun to cal float sum
    public static float sum(float a , float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum is : "+sum(9,8));
        System.out.println("Sum is : "+sum(2,4));
        System.out.println("Sum is : "+sum(4.2f,5.5f));
    }
}

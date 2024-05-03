public class PowerOf2 {
    public static void powerOf2(int n){
      if((n & (n-1)) == 0){
        System.out.println(n+" is a Power of 2");
      }else{
        System.out.println(n+" is not a Power of 2");
      }
    }
 
    // OR 
    
    public static boolean isPowerof2(int n){
        return ((n&(n-1)) == 0);
    }
    public static void main(String[] args) {
        powerOf2(8);
        System.out.println(isPowerof2(5));
    }
}

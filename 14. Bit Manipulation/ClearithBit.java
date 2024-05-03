public class ClearithBit {

    public static int ClearithBit(int n , int i){
       int bitMask = ~(1<<i);
       return n & bitMask;
       
    }
    public static void main(String[] args) {
        System.out.println(ClearithBit(10, 1));
    } 
}

public class ClearLastithBit {
    public static int ClearLastithBit(int n,int i){
        int bitMask = (~0)<<i;
        return n & bitMask;

    }
    public static void main(String[] args) {
        System.out.println(ClearLastithBit(15, 2));
    }
}

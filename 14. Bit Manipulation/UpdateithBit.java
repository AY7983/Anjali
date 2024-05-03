public class UpdateithBit {
    
    public static int ClearithBit(int n , int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
        
     }
     public static int SetithBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int UpdateithBit(int n , int i , int newBit){
        if(newBit == 0){
            return ClearithBit(n,i);
        }else{
            return SetithBit(n, i);
        }
    }


    // it has although a different approach to solve this along with same time complexity
    // n = ClearithBit(n, i);
    // int bitMask = newBit << i ;
    // return n | bitMask;
    // }
    public static void main(String[] args) {
        System.out.println(UpdateithBit(10,2, 1));
    }
}

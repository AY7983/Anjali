public class Reverse {
    public static void main(String[] args) {
        int n = 10899 , rev = 0;
        while(n > 0){
         rev = 0 + n%10;
         System.out.print(rev);
          n/=10;
        }
        System.out.println();

        // for(n=10899;n>0;n/=10){
        //     rev = 0+ n%10;
        //     System.out.print(rev);
        // }
    }
}

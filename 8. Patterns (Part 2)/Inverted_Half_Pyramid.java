public class Inverted_Half_Pyramid {

    public static void InvertedR_Half_Pyramid(int n){
        //OUTER LOOP
       for(int i = 1; i <= n ; i++){
        //SPACES
        for(int j = 1 ; j <= n-i ; j++){
            System.out.print(" ");
        }
        // STAR
        for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
       }
    
    public static void main(String[] args) {
        InvertedR_Half_Pyramid(5);
    }
}

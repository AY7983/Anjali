public class Hollow_Rhombus_Patteren {
    public static void hollow_rhombus_pattern(int n){
        //outer loop
        for(int i = 1 ; i <= n ; i++){

            //spaces
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            //hollow Rectangle-stars
            for(int j = 1 ; j <= n ; j++){
                if( i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rhombus_pattern(5);
    }
}

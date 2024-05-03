import java.util.Scanner;

public class Inverted_Half_Pyramid_Num {
    static void Inverted_Half_Pyramid_Number(int n){
        //  for(int i = n; i >=1 ; i--){
        //     for(int j = 1 ; j <= i ; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number for pattern : ");
        int n = sc.nextInt();
        Inverted_Half_Pyramid_Number(n);
;    }
}

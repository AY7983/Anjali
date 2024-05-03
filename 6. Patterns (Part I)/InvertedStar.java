public class InvertedStar {
    public static void main(String[] args) {
    //     for(int lines = 4 ; lines >= 1 ; lines--){
    //         for(int star = 1;star<=lines;star++){
    //             System.out.print("*");
    //         }
    //      System.out.println();
    //     }
    // }


    //Second Method
    int n =7;
    for(int lines = 1;lines<=n;lines++){
        for(int star=1; star <= n-lines+1 ;star++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}

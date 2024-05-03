import java.util.Scanner;
public class Multiple10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // do{
        //     System.out.print("Enter any number : ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
            //         break;
            // System.out.println("no. is multiple of 10");
        //     }
        //     System.out.println(num);
        // }while(true);


        while(true){
            System.out.println("Enter any number :");
            int num = sc.nextInt();
            if(num%10==0)
                break;
                
                System.out.println(num);
            }
            System.out.print("num is multiple of 10.");
    }
}

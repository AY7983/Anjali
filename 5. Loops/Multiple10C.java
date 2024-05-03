import java.util.Scanner;
public class Multiple10C {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    // while(true){
    //     System.out.println("Enter any number :");
    //     int num = sc.nextInt();
    //     if(num%10==0)
    //         continue;
    //      System.out.println("number was : "+num);
    //     }
    // }
 

    do{
            System.out.print("Enter any number : ");
            int num = sc.nextInt();
            if(num%10==0){
                    continue;
                }
                System.out.println("number was : "+num);
            }while(true);
            
    
    }
}

import java.util.*;
public class Even {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no.");
    int no = sc.nextInt();
    if(no % 2 == 0){
        System.out.println("no. is even");
    }
    else{
        System.out.println("no. is odd");
    }

   } 
}

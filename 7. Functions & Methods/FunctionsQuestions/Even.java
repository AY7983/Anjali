import java.util.Scanner;
public class Even {
     
    
    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integer : ");
        int n = sc.nextInt();
        if(isEven(n)){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is Odd ");
        }
    }
}

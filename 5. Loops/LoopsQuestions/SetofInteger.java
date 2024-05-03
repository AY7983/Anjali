import java.util.Scanner;

public class SetofInteger {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n , sumodd =0, sumeven = 0 ;
    System.out.print("How many integers you want to sum : ");
    int count = sc.nextInt();
    System.out.println("Enter a set of integer ");
    while(count>0){
        n = sc.nextInt();
        if(n%2==0){
            sumeven+= n;
        }
        else{
            sumodd+= n;
        }
        count--;
    }
    System.out.println("The sum of even integers is :"+sumeven);
    System.out.println("The sum of odd integers is :"+sumodd);
}
    
}

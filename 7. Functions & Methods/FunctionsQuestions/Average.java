import java.util.Scanner;

public class Average{
     static void calcAverage(int a,int b, int c){
        int avg = a+b+c/3;
        System.out.println("Average is "+avg);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first no.");
        int a = sc.nextInt();
        System.out.println("Enter your second no.");
        int b = sc.nextInt();
        System.out.println("Enter your third no. ");
        int c = sc.nextInt();
        calcAverage(a,b,c);
    }
}
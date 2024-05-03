import java.util.Scanner;
public class PrintN {
    public static void main(String[] args) {
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int range = sc.nextInt();
        while(counter<=range){
            System.out.print(counter+" ");
            counter++;
        }
    }
}

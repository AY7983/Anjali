import java.util.*;
public class Average3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Firstno. : ");
        float A = sc.nextFloat();
        System.out.println("Enter the Secondno. :");
        float B = sc.nextFloat();
        System.out.println("Enter the Thirdno. : ");
        float C = sc.nextFloat();
        float Average = (A+B+C)/3;
        System.out.println("The Average of these three numbers is :" +Average);
    }
}

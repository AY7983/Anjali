import java.util.*;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks : ");
        int marks = sc.nextInt();
        String result = marks>33 ? "Pass": "Fail";
        System.out.println("The Result is : "+result);
    }
}

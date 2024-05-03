import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square : ");
        float side=sc.nextFloat();
        float Area = side * side;
        System.out.println("The Area of square is : "+Area);

    }
}

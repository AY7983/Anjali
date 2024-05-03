import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius of a circle :");
        float rad = sc.nextFloat();
        float Area = 3.14f * rad *rad;
        System.out.println("Calculated Area of a Circle is : \n"+Area);

    }
}

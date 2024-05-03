import java.util.Scanner;
public class Cost {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Price of a Pencil : "); 
       float Pencil = sc.nextFloat();
       System.out.print("Enter the Price of a Pen : ");
       float Pen = sc.nextFloat();
       System.out.print("Enter the Price of a Eraser : ");
       float Eraser = sc.nextFloat();
       float total = Pencil + Pen + Eraser;
       System.out.println("Calculated the Total bill amount is :"+total);


    //    Add on 18% gst
     float newtotal = total + (0.18f * total);
     System.out.println("Now the calculated bill amount is : "+newtotal);
    }
}

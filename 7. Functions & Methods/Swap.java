public class Swap {

    public static void SwaP(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        SwaP(a,b);
        System.out.println("a is "+a);
        System.out.println("b is "+b);
}
}
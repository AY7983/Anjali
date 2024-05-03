public class Product {

public static int Multiply(int a , int b){
    int product = a * b;
    return product;
}
    public static void main(String[] args) {
        int prod = Multiply(3,4);
        System.out.println("product is "+prod);
        prod = Multiply(5,6);
        System.out.println("Product is "+prod);
    }
}

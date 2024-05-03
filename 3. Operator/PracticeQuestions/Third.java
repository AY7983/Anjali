public class Third {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2;
        x += y;
        System.out.println(x);
        y -= z;
        System.out.println(y);
        System.out.println(z);
        z/= (x+y);
        System.out.println(x+ " " +y+" " +z+" ");
    }
}

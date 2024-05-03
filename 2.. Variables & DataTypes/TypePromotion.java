public class TypePromotion{
    public static void main(String[] args) {
        // char a ='a';
        // short b = 50;
        // int c = a+b;
        // System.out.println(c);

        // char b ='b';
        // System.out.println((int)b);
        // char c = 'c';
        // System.out.println((int)c);
        // System.out.println(b-c);
        // System.out.println(b+c);
        // char d = b-c;

        // short a = 5;
        // byte b1 =25;
        // char c1 ='c';
        // byte bt =(byte) (a+b1+c1);
        // System.out.println(bt);


        int a=10;
        float b2 = 20.25f;
        long c2 =25;
        double d=30;
        double ans = a+b2+c2+d;
        // int ans = a+b2+c2+d;
        System.out.println(ans);

        // byte b=23;
        // byte b1= b*2;
        // System.out.println(b1);
        
        byte b = 23;
        b=(byte)(b*2);
        System.out.println(b);

    }
}
public class Output {
    public static void main(String[] args) {
    Test t = new Test();
    t.changeB();
    System.out.print(Test.a + Test.b);
    }
}

class Test{
    static int a = 10;
    static int b;
    static void changeB(){
        b = a * 3;
    }
}

public class SuperKey {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);

    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Aniaml Constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super();     // immediate parent class
        super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}

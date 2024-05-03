public class Abstract {
    public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);
     
    chicken c = new chicken();
    c.eat();
    c.walk();

    }
}
abstract class Animal{
    String color;

    Animal(){
      color = "brown";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();    //Here Animal gives idea that  walk function exist in every fun with return type void
    //   and walk fun do not take any parameters;(not gives implementation it is just idea which is given by abstrat animal class) 
}
class Horse extends Animal{

    void changecolor(){
        color = "dark brown";
    
    }
    void walk(){
      System.out.println("walks on 4 legs");
    }
}

class chicken extends Animal{
    void changecolor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Hybridlevel {
    

    public static void main(String[] args) {
      Bird b = new Bird();
      b.eat();
      b.fly(); 
      Mammals m = new Mammals();
      m.eat();
      m.walk(); 
      Fish f = new Fish();
      f.eat();
      f.swim(); 
    
    }
}

//Base Class 'OR' Parent Class.
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breaathe");
    }
}

class Mammals extends Animal{
   int legs;

   void walk(){
    System.out.println("walks");
   }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

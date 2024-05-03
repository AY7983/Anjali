public class Hierarchal {

    

    public static void main(String[] args) {
      Human h1 = new Human();
      h1.think();

      Bird b1 = new Bird();
      b1.fly();

      Peacock p1 = new Peacock();
      p1.dance();

      shark s1 = new shark();
      s1.bigTeeth();
;    
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

class Human extends Mammals{
    void think(){
        System.out.println("Think");
    }
}
class Dog extends Mammals{
    void bark(){
        System.out.println("Bark");
    }
}
class Cat extends Mammals{
    void mew(){
        System.out.println("mew...");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class tuna extends Animal{
    void strong(){
        System.out.println("strong");
    }
}
class shark extends Animal{
    void bigTeeth(){
        System.out.println("long teeth");
    }
}


class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

class Peacock extends Bird{
    void dance(){
        System.out.println("Dance");
    }
}


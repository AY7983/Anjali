public class MultilevelInheritance {

    public static void main(String[] args) {
        Dog jakie = new Dog();
        jakie.eat();
        jakie.legs = 4;
        System.out.println(jakie.legs);
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
}
class Dog extends Mammals{
    String breed;
}

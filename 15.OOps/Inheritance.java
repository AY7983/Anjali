public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
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

//Derived Class 'OR' Child Class
class Fish extends Animal{
    int fins;
     
    void swims(){
        System.out.println("Swims");
    }
}
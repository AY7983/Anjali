public class AbstractConstr {
        public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        //Aniaml -> Horse -> Mustang

        }
    }
    abstract class Animal{
        Animal(){
            System.out.println("Aniaml constructor called");
        }
       
        void eat(){
            System.out.println("Animal eats");
        }
        abstract void walk();    //Here Animal gives idea that  walk function exist in every fun with return type void
        //   and walk fun do not take any parameters;(not gives implementation it is just idea which is given by abstrat animal class) 
    }
    class Horse extends Animal{
        Horse(){
            System.out.println("Horse Constructor called");
        }
       
        void walk(){
          System.out.println("walks on 4 legs");
        }
    }

    class Mustang extends Horse{       //Breed of Horse
         Mustang(){
            System.out.println("Mustang Constructor Called");
         }
    }
    
    class chicken extends Animal{
        
        void walk(){
            System.out.println("Walks on 2 legs");
        }
    }


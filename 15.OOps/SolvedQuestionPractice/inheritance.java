public class inheritance {
    
        public static void main(String[] args) {
            Vehicle obj1 = new Car();
            // obj1.print1(); - > error
    
            Vehicle obj2 = new Vehicle();
            obj2.print();
        }
    }
    
    class Vehicle{
        void print(){
            System.out.print("Base class(Vehicle)");
        }
    }
    
    class Car extends Vehicle{
        void print1(){
            System.out.print("Derived class(Car)");
        }
    }
    


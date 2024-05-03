public class Constructor {
    public static void main(String[] args) {
        Student s1 = new  Student(); // call the first constructor
        Student s2 = new  Student("Anjali");   //call the Second constructor
        Student s3 = new  Student(123);   //call the third constructor
        // Student s4 = new  Student("Anju",567);



    
        
    }
}
class  Student{
    String name;
    int roll;

    // for initialization the Student we make a constructor

    //Non-Parameterised constructor
    Student(){
        System.out.println("Constructor is called..");
    }

    //parameterised constructor
    Student(String name){
        this.name = name;
        // System.out.println();
    }


    Student(int roll){
        this.roll = roll;
    }

}

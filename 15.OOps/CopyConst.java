public class CopyConst {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anju";
        s1.roll = 45;
        s1.password = "adcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] =80;


        
        Student s2 = new Student(s1);     //copy constructor
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i =0 ; i <3 ;i++){
            System.out.println(s2.marks[i]);
        }

    }
}
    class  Student{
        String name;
        int roll;
        String password;
        int marks[];

       
        //shallow copy constructor
        // Student(Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll =s1.roll;
        //     this.marks = s1.marks;
        // }


        //deep copy constructor
        Student (Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll =s1.roll;
            for(int i =0 ; i < marks.length ; i++){
                this.marks[i] = s1.marks[i];
            }
        }
    
        // for initialization the Student we make a constructor
    
        //Non-Parameterised constructor
        Student(){
            marks = new int[3];
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


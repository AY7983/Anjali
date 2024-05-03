public class VariableAccess {
    public static void main(String[] args) {
        Person p = new Person();
        p.weight = 45;
        System.out.println(p.weight);
        // p.rollNumber  (we cannot  access the child class variable into parent class)
        // p.schoolName (no access schoolname of child class)
    }
}
class Person{
    String name;
    int weight;
}
class Student extends Person{
    int rollNumber;
    String schoolName;
}

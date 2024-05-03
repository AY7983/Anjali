class AssignName{
    public static void main(String[] args) {
        Student S = new Student();
        S.name = "Anjali";
        System.out.println("Name is : "+S.name);
        S.marks = 98;
        System.out.println("Marka is : " + S.marks);

    }
}
class Student{
    String name;
    int marks;
}
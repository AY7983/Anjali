public class Argument {

    public static void update(int marks[] , int nonChangable ){
        nonChangable=10;
        for(int i = 0 ; i < marks.length ; i++ ){
            marks[i]+=1;
            // marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = { 97 , 98 , 99};
        int nonChangable = 5;
        update(marks, nonChangable);
        System.out.println(nonChangable); // main fun k andr iski value change nhi hui (pass by value)
        
        //print our marks
        for(int i = 0 ; i < marks.length ; i++){
            System.out.print(marks[i]+ " ");  // main fun k andr iski value bhi change ho jaygi (pass by reference)
        }
        System.out.println();
    }
}

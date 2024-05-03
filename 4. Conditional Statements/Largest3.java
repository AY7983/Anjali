public class Largest3 {
    public static void main(String[] args) {
        int A = 1, B = 7, C = 16;
        if(A >= B  &&  A >= C){
            System.out.println(A+" is a largest value");
        }
        else if(B >= C){
            System.out.println(B+" is a largest value");
        }
        else{
            System.out.println(C+" is a largest value");
        }
    }
}

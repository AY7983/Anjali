public class Scope {

    public static void printS(){
        int sd = 10;
    }
    public static void main(String[] args) {
        int p = 10;
        // System.out.println(S); we cannot use this before declaration
        int S = 45;
        System.out.println(S);
        // System.out.println(sd); //it is also not used this variable which has scope in fun 'printS' only .

        {
            int s = 45;
            System.out.println(p);
        }
        System.out.println(s);// s has a block scope of above
        System.out.println(p);  // p is present in function scope. 
    }
}

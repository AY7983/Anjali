public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Anju";
        String s2 = "Anju";
        String s3 = new String("Anju");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1 == s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}

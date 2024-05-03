public class ReverseNum {
    public static void main(String[] args) {
        int n = 10899 , rev = 0 , lastdigit = 0;
        while(n>0){
            lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n=n/10;
        }
        System.out.println("The Reverse is : "+rev);
    }
}

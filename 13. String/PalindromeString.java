public class PalindromeString {
    public static boolean isPalindrome(String str){
        int n = str.length();
     for(int i = 0; i < str.length()/2 ; i++){
        if(str.charAt(i) != str.charAt(n-1-i)){
            //not a palindrome
            System.out.println("It is not a palindrome");
         return false;
        }
     }
     System.out.println("It is palindrome");
     return true;
    }
    public static void main(String[] args) {
        String str = "Anjali";
        System.out.println(isPalindrome(str));
    }
}

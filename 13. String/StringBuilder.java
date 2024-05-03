import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch <= 'z'; ch++){
           sb.append(ch);
           //abcdefghi....
           //o(26)  -> in case of string builder
           //o(26 * n / n^2)  -> in case of string;
        }
        System.out.println(sb.length());
    }
}

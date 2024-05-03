public class StringSearch {

    static int LinearSearch(String num[],String key){
        for(int i = 0 ; i < num.length ; i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     String str[] = { "apple" , "mango" , "banana" , "litchi" , "papaya"};
     String str1 = "litch";
     int index = LinearSearch(str,str1);
     if(index == -1){
        System.out.println("Key is not found");
     }
     else{
        System.out.println("Key is found at index :"+index);
     }
    }
}

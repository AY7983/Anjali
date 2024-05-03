public class LinearSearch {
    public static void main(String[] args) {
        int key = 10;
    int numbers[] = {2,4,6,8,10,12,14,16}; 
    for(int i = 0 ; i<=numbers.length-1;i++){
        if(numbers[i]==key){
          System.out.println(i+" is index where 10 is present.");
        }
    }
 }
}

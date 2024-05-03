public class Largest {

    static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;  //(- infinitive)
        int smallest = Integer.MAX_VALUE; //(+ infinitive)

        for(int i = 0 ; i < num.length ; i++ ){
            if(num[i]>largest){
                largest = num[i];
            }
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        System.out.println("Smallest num is : "+smallest);
        return largest;
        }
    
    public static void main(String[] args) {
    int num[] = {1,2,6,3,5};
    System.out.println("Largest Value is : "+getLargest(num));

    }
}

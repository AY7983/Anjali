public class BinarySearch {

    static int searchBinary(int num[],int key){
     int start = 0;
     int end = num.length-1;
     while(start <= end){
         int mid = (start+end)/2;

            //comparisons

            if(num[mid]==key){  //found
                return mid;
            }
            else if(num[mid] > key ){ //left
                end = mid-1;
            }
            else if(num[mid] < key){  //right
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     int arr[] = {2,4,6,8,10,12,14};
     int key = 12;
     int index = searchBinary(arr,key);
     if(index == -1){
        System.out.println("Key is not found");
     }
     else{
        System.out.println("Key "+key+" is at index "+index);
     }

    }
}

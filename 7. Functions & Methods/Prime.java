public class Prime {
    
    //only for n >= 2
    // public static boolean isPrime(int n){

       //corner case
       //2
//        if(n==2){
//         return true;
//        }

//       for(int i = 2; i<=n-1; i++){
//          if(n%i==0){         //this is completely dividing
//              System.out.println("Not Prime");
//              return false;
//          }

//       }
//         return true;
//       }


  
public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i = 2 ; i<=Math.sqrt(n);i++){    //optimize method
        if(n%i==0){
            return false;
        }
    }
    return true;
}
    
    public static void main(String[] args) {

        System.out.println(isPrime(16));
    }
}

public class Sum { 

        public static int sumfirst(int n){
            if(n == 1){
                return 1;
            }
            int Snm1= sumfirst(n-1);
            int Sn = n+Snm1;
            return Sn;
            
            // return (n*factorial(n-1));
        }
        public static void main(String[] args) {
           System.out.println("The sum  is "+sumfirst(5));
        }
    }
    


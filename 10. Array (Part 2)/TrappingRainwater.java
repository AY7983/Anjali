import java.util.*;
public class TrappingRainwater {
    public static int trappedRainwater(int height[]){

        //Calculate left max boundary - array(Auxiliary or helper Array)
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i = 1 ; i < height.length ; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        //Calculate right max boundary - array
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length -1];
        for(int i = height.length - 2 ; i >= 0 ; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trappedwater = 0;
        //loop
        for(int i = 0 ; i < height.length ; i++){
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            trappedwater += waterlevel - height[i] ;
        }
        //waterLevel = min(leftmax bound , rightmax bound)
        //trapped water = waterlevel - height[i]

        return trappedwater;
    }
    public static void main(String[] args) {
      int height[] = {4,2,0,6,3,2,5}; 
       System.out.println("The trapped rainwater is : "+trappedRainwater(height));
    }
}

public class TrappedWater {

    public static int trappedwater(int height[]){
     int trappedwater = 0;

     //Calculate the left max boundary
     int left[] = new int [height.length];
     left[0] = height[0];
     for(int i = 1; i < height.length;i++){
        left[i] = Math.max(height[i],left[i-1]);

     }
     int right[] = new int [height.length];
     right[height.length - 1] = height[height.length - 1 ];
     for(int i = height.length - 2; i >= 0 ; i--){
        right[i] = Math.max(height[i],right[i+1]);
     }

     for(int i = 0; i < height.length - 1 ; i++){
        int waterlevel = Math.min(left[i] , right[i]);
        trappedwater += waterlevel - height[i];
     }

     return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {0,1,2,1,0,1,3,2,1,2,1};
        System.out.println("The trapped Water is : " +trappedwater(height));
    }
}

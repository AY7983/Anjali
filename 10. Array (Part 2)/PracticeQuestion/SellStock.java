public class SellStock {

    public static int sellStock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                 maxProfit = Math.max(buyprice , profit);
            }
            else{
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,16,9};
        System.out.println("The maxProfit is " +sellStock(prices));
    }
}

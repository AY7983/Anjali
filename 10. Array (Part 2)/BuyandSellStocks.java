import java.util.*;
public class BuyandSellStocks {

    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; //today's Profit
                maxProfit = Math.max(maxProfit , profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
}
    public static void main(String[] args) {
        int prices[] = {2,3,10,7,9,12,7};  //o(n)
        System.out.println("The maximum Profit is : "+buyAndSellStocks(prices));
    }
}

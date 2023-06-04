import java.util.ArrayList;

public class BuySellStock{
    public static int maximumProfit(ArrayList<Integer> prices){
        int maxSum = 0;
        int currSum = 0;

        for(int i=1; i<prices.size(); i++){
            currSum = Math.max(0,currSum += prices.get(i) - prices.get(i-1));
            maxSum = Math.max(currSum,maxSum);
        }

        return maxSum;
    }
}

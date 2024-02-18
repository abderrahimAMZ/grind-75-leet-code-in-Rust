
import java.util.*;




class Solution {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        // we will fill our array with a maxed value, amount +1 is already enough
        Arrays.fill(dp,amount+1);
        // we will solve from the button up
        dp[0] = 0;


        for (int amnt = 1; amnt<=amount;amnt++){

            for (var coin: coins ) {
                if (amnt-coin >= 0){


                    // this line is mind blowing, take for example coints like this [1,3,4,5] , amount = 7: dp[7] = min(dp[7], 1+dp[7-3=4]=2); dp[4] = 1 because min(dp[4]+ 1+dp[4-4] = 1, we iterate over coins!
                    dp[amnt] = Integer.min(dp[amnt], 1+ dp[amnt-coin]);
                }
            }

        }

        if (dp[amount] == amount+1){
            return -1;
        }
        else {
            return dp[amount];
        }
    }

}

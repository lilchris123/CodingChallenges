package challenges.dp;

import java.util.*;
/*
Shopaholic needs to buy one of each item, given his budget and prices of the items, 
how many ways can he buy them?

price of jeans [2,3]
price of shoes [4]
price of skirts [2,3]
price of top [1,2,3]

Budget = $10

*/

public class NumWaysToBuy {
    public static int numWaysDP(List<Integer> priceOfJeans, 
    List<Integer> priceOfShoes, List<Integer> priceOfSkirts, 
    List<Integer> priceOfTops, int budget){
    
    int n= priceOfJeans.size() * priceOfShoes.size() * priceOfSkirts.size() * priceOfTops.size();
    int dp[]= new int[n];
    dp[0]=0;
    dp[1]=priceOfJeans.get(0);

    // for(int i=0; i<=n; i++){
    //     int spent = dp[priceOfJeans.get()]
    //     if(spent <= budget)

    // }

    return dp[n];
    }

    public static int bruteforce(List<Integer> priceOfJeans, 
    List<Integer> priceOfShoes, List<Integer> priceOfSkirts, 
    List<Integer> priceOfTops, int budget){

        int ways=0;

        for(int j=0; j<priceOfJeans.size(); j++){
            for(int s=0; s <priceOfShoes.size(); s++){
                for(int sk=0; sk< priceOfSkirts.size(); sk++){
                    for(int t=0; t< priceOfTops.size(); t++){
                        int spent= priceOfJeans.get(j)+priceOfShoes.get(s)+priceOfSkirts.get(sk)+priceOfTops.get(t);
                        if(spent <= budget)
                            ways++;
                    }
                }
            }
        }
        return ways;
    }
}

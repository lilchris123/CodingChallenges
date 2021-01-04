package challenges.daily;
/*
    This problem was asked by Facebook.

Given a array of numbers representing the stock prices of a company in chronological order, 
write a function that calculates the maximum profit you could have made from buying and selling that stock once. 
You must buy before you can sell it.

For example, given [9, 11, 8, 5, 7, 10], you should return 5, 
since you could buy the stock at 5 dollars and sell it at 10 dollars.
*/
public class MaxProfit47 {
    
    //Maximum profit if we buy and sell stock one time. 
    public static int MaxProfit(int[] arr){
        int maxProfit=0;
        int currProfit=0;

        for(int i=1; i<arr.length; i++){
            //check if next day is profitable, if it's a maxProfit
            if(arr[i-1]< arr[i]){
                currProfit+= arr[i]-arr[i-1];
                if(currProfit >maxProfit)
                    maxProfit= currProfit;
            }
            //if next day not profitable reset our current profit
            else
                currProfit=0;
        }

        return maxProfit;
    }


    // Maximum Profit if we buy and sell stocks multiple times
    public static int MaxProfit2(int[] arr){
        int maxProfit=0;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]< arr[i])
                maxProfit+= arr[i]-arr[i-1];
        }
        return maxProfit;
    }
}

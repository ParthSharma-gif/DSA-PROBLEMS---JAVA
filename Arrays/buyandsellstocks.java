public class buyandsellstocks {
//time space complexity = o(n) because we start the array from the for loop and we count it
    public static int buyandsellstocks(int prices[]) {
        int buyprices = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprices <= prices[i]) {
                int profit = prices[i] - buyprices;
                maxProfit = Math.max(maxProfit, profit);

            } else {
                buyprices = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = {3, 1, 3, 4, 57, 8, 4, 2, 1};
        System.out.println(buyandsellstocks(prices));
    }
}

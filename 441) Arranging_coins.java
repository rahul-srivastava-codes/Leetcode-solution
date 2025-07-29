You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.


class Solution {
    public int arrangeCoins(int n) {
        int m = 0;
        int sum = 0;
        int x = 1;
        for(int i=1; i<=n; i++){
            n = n - i;
            
            if(n<0){
                return sum;
            }
            sum++;
        }
        return sum;
    }
}

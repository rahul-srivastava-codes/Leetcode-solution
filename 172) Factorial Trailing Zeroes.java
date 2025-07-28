Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.

class Solution {
    public int trailingZeroes(int n) {
        if(n<4){
            return 0;
        }
        int sum = 0;
        while(n!=0){
            sum = sum + n/5;
            n /= 5;
        }
        return sum;
    }
}

This solution beats 100% of java submission

// Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

// A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

// If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.

class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<nums.length; i++){
            sum1 = 0;
            sum2 = 0;
            if(i == 0){
                sum1 = 0;
                for(int a=1; a<nums.length; a++){
                    sum2 = sum2 + nums[a];
                }
            }
            else if(i == (nums.length - 1)){
                sum2 = 0;
                for(int b=0; b<nums.length-1; b++){
                    sum1 = sum1 + nums[b];
                }
            }
            else{
                for(int p = 0; (p < i) ; p++ ){
                    sum1 = sum1 + nums[p];                    
                }
                for(int q = nums.length - 1; q > i ; q--){
                    sum2 = sum2 + nums[q];
                }
            }

            if(sum1 == sum2){
                return i;
            }

            
        }
        return -1;
    }
}

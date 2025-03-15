// Given an integer array nums, return the maximum result of nums[i] XOR nums[j], where 0 <= i <= j < n.

// solution works but time limit exceeded so it is not a optimal solution

class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;

        for(int i= 0; i<nums.length;i++){
            int x = 0;
            for(int j = 0; j<nums.length; j++){
                if(i != j){
                    x = nums[i]^nums[j];
                }
                if(x>max){
                    max = x;
                }
            }            
        }
        return max;
        
    }
}

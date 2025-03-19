class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        for(int i =0; i<nums.length; i++){
            if(2*nums[i]>max && i != index){
                return -1;
            }
        }
        return index;
    }
}
// Beat 100% in terms of time
// You are given an integer array nums where the largest integer is unique.

// Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.

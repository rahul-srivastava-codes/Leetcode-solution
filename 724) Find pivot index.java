// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.


class Solution {
    public int pivotIndex(int[] nums) {
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

// not a good time although, but solved overall

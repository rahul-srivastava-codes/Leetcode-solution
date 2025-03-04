// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only constant extra space.

/**
 * @param {number[]} nums
 * @return {number}
 */

// JS solution
var singleNumber = function (nums) {
    var a=0;
    if(nums.length<=1){
        a = nums[0];
        return a;
    }
    for(let i = 0; i<nums.length; i++){
        a = a^nums[i];        
    }
    return a;

};

// Java solution
class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        if (nums.length <= 1) {
            a = nums[0];
            return a;
        }
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        return a;
    }
}

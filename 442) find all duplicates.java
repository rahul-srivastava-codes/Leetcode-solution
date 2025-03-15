/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let result = [];
    nums.sort((a,b) => a-b);
    for(let i = 0; i<nums.length-1; i++){
        if((nums[i]==nums[i+1])){
            result.push(nums[i]);
        }
    }
    return result;
};

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

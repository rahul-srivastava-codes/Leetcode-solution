// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    nums.sort((x, y) => x - y);
    console.log(nums);
    var x = nums[0];
    var y=0;
    if(nums[0]!= 0){
        return 0;
    }
      
    for(let i = 0; i < nums.length; i++){
        if(nums[i]== x){
            x++;
        } else {
            y = x;
            return y;            
        }              
    }
    if(nums[nums.length-1]!=nums.length){
        y = nums.length;
        return y;        
    }
};

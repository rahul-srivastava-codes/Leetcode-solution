/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    nums.sort((a,b)=>a-b)
    let count = 1;
    let j = 0;
    for(let i = 1; i<nums.length; i++){
        if(nums[j] == nums[i]){
            count++;
            nums[j] = nums[i];
        }
        j++;
        if(count == 2){
            return true;
        }
    }
    return false;
};

 // not so good but decent enough for me, but still miles to go

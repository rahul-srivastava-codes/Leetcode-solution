// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    // for(let i =0; i<nums.length-1; i++){
    //     for(let j =i+1; j<nums.length; j++){
    //         if(i != j){
    //             if(nums[i] + nums[j] == target){
    //                 return [i,j];
    //             }
               
    //         }
    //     }
    // }
    // for(let i =0; i<nums.length-1; i++)
    var i =0;

    while(i<nums.length-1){
        let j=i+1
        while(j<nums.length){            
                if(nums[i] + nums[j] == target){
                    return [i,j];
            }
            j++;
        }
         i++;
    }
    // int i=0,j=0;
    // while(i!=j)
    // while(nums[i]+nums[j])
};

// only issue is time 

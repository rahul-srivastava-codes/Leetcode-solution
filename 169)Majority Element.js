// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
    var n = (Math.round((nums.length) / 2));
    var a;
    if (nums.length <= 1) {
        a = nums[0];
    }
    for (let i = 0; i < nums.length; i++) {
        var x = 0;
        for (let j = i; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                x++;
            }
        }
        if (x == n) {
            a = nums[i];
            break;
        }

    }
    return a;
};

Code is correct but it is taking a lot of time

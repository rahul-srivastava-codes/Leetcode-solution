class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        boolean t = false;
        for (int i = 0,j = i + 1; i < nums.length,j < nums.length; i++,j++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    t = true;
                    break;
                }
            }
        }
        return t;
    }
}

// this one works but time limit exceeded

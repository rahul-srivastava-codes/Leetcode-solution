class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = n+m;
        int[] arr = new int[x];
        int i = 0;
        int j = 0;
        int k = 0;
         

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            } else{
                arr[k] = nums2[j];
                j++;
                k++;
            }  
        }  
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        // Copy merged result back to nums1
        for (int t = 0; t < x; t++) {
            nums1[t] = arr[t];
        } 
    }
}


// beat 100%  and time complexity 0ms
// grateful

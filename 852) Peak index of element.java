class Solution {
    public int peakIndexInMountainArray(int[] arr) {        
        // using linear search
        // int max =arr[0];
        // int count = 0;
        // for(int i=1; i<arr.length; i++){
        //     if(arr[i]> max){
        //         max = arr[i];
        //         count++;
        //     }
        // }
        // return count;

    }
}

// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.


// using binary search
class Solution {
    public int peakIndexInMountainArray(int[] arr) {       
        int start = 0;
        int end = arr.length -1;
        while(start<end){
            int mid = (start + end)/2;
            if(arr[mid]>arr[mid+1]) end = mid;
             else  start = mid+1;                   
        }
        System.gc();
        return start;
    }
}

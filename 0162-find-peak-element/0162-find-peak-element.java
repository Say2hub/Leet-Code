class Solution {
    public int findPeakElement(int[] nums) {
        int res = search(nums);
       return res;
   }
   int search (int[] nums){
    int start = 0;
    int end = nums.length-1;
    while(start<end){
        int mid=start+(end-start)/2;
        //This section means u are in the descending part of the Array
        //There might be some possible greatest number to the left sub array
        //Therefore move till end = mid as the middle element maybe the greatest number.
        if(nums[mid]>nums[mid+1]){
            end=mid;
        }
        //This section means to check if there is any greater number in the right sub array
        //We check from mid+1 to end as we know mid element less than mid+1.
        else{
            start=mid+1;
        }
    }
    return start;
    }
}
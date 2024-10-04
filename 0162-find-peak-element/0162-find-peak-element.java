class Solution {
    public int findPeakElement(int[] nums) {
        int index = -1;
        int peak = nums[0];
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>=peak){
                index=i;
                peak=nums[i];
            }
            else continue;
        }
    return index;
    }
}
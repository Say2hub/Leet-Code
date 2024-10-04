class Solution {
    public int findMin(int[] nums) {
        int min = nums[0];
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=min){
                min=nums[i];
            }
            else continue;
        }
      return min;  
    }
}
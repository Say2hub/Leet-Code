class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = -1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                index = i;
                break;
            }
            else{
                if(nums[i]>target){
                    index = i;
                    break;
                }
                else if (target!=nums[i]&& target>nums[n-1]){
                    index=n;
                }
                
            
            }
        }
    return index;  
    }
}
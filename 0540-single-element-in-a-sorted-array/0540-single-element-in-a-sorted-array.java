class Solution {
    public int singleNonDuplicate(int[] nums) {
        int count = 1;
        int n = nums.length;
        int i;
        for(i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else {
                if(count==1){
                    return nums[i-1];
                }
                count =1;
            }
          
        }
    return nums[n-1];
    }
}
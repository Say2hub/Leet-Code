class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int i = 0;
        while(i < nums.length-1){
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(count>1){
                return true;
            }
            i++;
        }
    return false;
    }
}
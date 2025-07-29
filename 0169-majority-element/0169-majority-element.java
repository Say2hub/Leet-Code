class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int num = 0;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(count>=nums.length/2){
                    num=nums[i];
                }
            }       
        }
    return num;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int len = 1;
        int max_len = 1;
        for(int i=1;i<nums.length;i++){
            //Duplicates
            if(nums[i]==nums[i-1]){
                continue;
            }
            else if(nums[i]==nums[i-1]+1){
                len++;
            }
            else{
                max_len=Math.max(max_len,len);
                len=1;
            }
        }
    return Math.max(max_len,len);
    }
}
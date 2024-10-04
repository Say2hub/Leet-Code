class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index = i;
            }
            else{
                continue;
            }
        }
    if(index>=0 && index<nums.length) return index;
    else return -1;

    }
}
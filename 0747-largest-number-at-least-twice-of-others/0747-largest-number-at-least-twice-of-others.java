class Solution {
    public int dominantIndex(int[] nums) {
        int largest = -1;
        int secondlargest = -1;
        int n = nums.length;
        int index = -1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                secondlargest=largest;
                largest=nums[i];
                index = i;
            } 
            else if(nums[i]>secondlargest){
                secondlargest=nums[i];
            }
        }
        if(largest>=secondlargest*2){
            return index;
        }
        else{
            return -1;
        }
       
    }
}
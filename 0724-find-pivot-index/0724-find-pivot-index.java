class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int left_sum = 0;
        int right_sum = 0;
        for(int i=0;i<n;i++){
           if(i==0){
            left_sum = 0;
           }
           else{
            left_sum += nums[i-1];
           }
           for(int j = i+1;j<n;j++){
            right_sum += nums[j];
           }
        if(left_sum==right_sum){
            return i;
        }
        else {
            right_sum=0;
        }
        }
return -1;   
    }
}
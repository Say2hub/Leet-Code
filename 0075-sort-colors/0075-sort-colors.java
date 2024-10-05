class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int middle = 0;
        while(middle<=right){
            if(nums[middle]==0){
                int temp = nums[left];
                nums[left]=nums[middle];
                nums[middle]=temp;
                left++;
                middle++;
            }
          else if(nums[middle]==1){
            middle++;
            }
          else{
            int temp = nums[middle];
            nums[middle]=nums[right];
            nums[right]=temp;
            right--;
          }
        }

}
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    int n = nums.length;
    int i;
    for(i=n-1;i>0;i--){
        k--;
        if(k==0) break;
        else continue;
    }
    int val = nums[i];
    return val;
    }
}
class Solution {
    public int[] searchRange(int[] nums, int target) {
      int [] res = {-1,1};
      int first = search(nums,target,true);
      int last = search(nums,target,false);
      res[0]=first;
      res[1]=last;
      return res;
    }
    int search(int[] nums,int target,boolean isFirstIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }else if(target>nums[mid]){
                start=mid+1;
            }else{
                ans=mid;
                if(isFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        
        }
    return ans;
    }
}
class Solution {
    public int splitArray(int[] nums, int k) {
        /*Brute Force: Only 10 test case out of 34
        int start = 0;
        int end = nums.length-1;
        int max_sum = 0;
        int sum_left = 0;
        int sum_right = 0;
        int min_sum = Integer.MAX_VALUE;
       while(end>start){
           for(int i=0;i<end;i++){
            sum_left +=nums[i];
           }
           sum_right+=nums[end];
           max_sum=Math.max(sum_left,sum_right);
           min_sum=Math.min(max_sum,min_sum);
           sum_left = 0;
           end--;
       }
    return min_sum;
    */
    int start = 0;
    int end = 0;
    for(int i=0;i<nums.length;i++){
        start=Math.max(start,nums[i]);
        end+=nums[i];
    }
    while(start<end){
        int mid = start + (end-start)/2;
        //We take the middle value of the range.
        //We have to reach the point where value of start, end and mid is Same.
        int sum = 0;
        int pieces = 1;
        for(int num:nums){
            if(sum+num>mid){
                sum=num;
                pieces++;
            }else{
                sum+=num;
            }
        }
        /*Two checks now:
        If pieces split is more than required , that means we are taking less sum amount of middle value, that means that we have to increase our sum value , Therefore we have to look in the right hand side of sub-array i.e start=mid+1;
        Else , that means that individual sum of array is more than required, so we need to look at reducing the middle value and therefore look at left hand side of sub-array.
        */
        if(pieces>k){
            start=mid+1;
        }else{
            end=mid;
        }
    }
  return end;
  }
}
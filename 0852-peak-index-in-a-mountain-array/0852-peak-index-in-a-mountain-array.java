class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int target = target(arr);
       int res = search(arr,target);
       return res;
    }
    int target(int[] arr){
      int max = -1;
      for(int i=1;i<arr.length;i++){
        if(arr[i]>arr[i-1]){
            max=arr[i];
        }
        else break;
      }
    return max;
    }
    int search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                ans=mid;
                break;
            }
       }
    return ans;
   }
}
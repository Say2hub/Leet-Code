/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mountainArr.get(mid)>target){
                end=mid-1;
            }else if(mountainArr.get(mid)<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
    return -1;
    }
}
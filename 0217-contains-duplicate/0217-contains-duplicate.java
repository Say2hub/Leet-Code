class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Time Complexity: O(nlogn)
        //Due to sorting
        /*Arrays.sort(nums);
        int i = 0;
        while(i < nums.length-1){
            if(nums[i]==nums[i+1]){
                return true;
            }
            i++;  
        }
    return false;
    */
    Set<Integer> set = new HashSet<>();
    for(int i:nums){
        set.add(i);
    }
    return set.size()<nums.length;
    }
}
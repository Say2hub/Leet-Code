class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        //Add all elements of first array into set.
        for(int i:nums1){
            set1.add(i);
        }
        //After that we'll check if the set contains element from 2nd array.
        for(int j:nums2){
            if(set1.contains(j)){
                intersection.add(j);
            }
        }
          
    int [] merged = new int[intersection.size()];
    int i = 0;
    for(int num:intersection){
        merged[i++]=num;
    }
return merged;
  }
}
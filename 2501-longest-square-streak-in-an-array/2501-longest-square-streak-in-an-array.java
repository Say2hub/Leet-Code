class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxStreak = -1;

        for(int num:nums){
            int currStreak = 0;
            long val = num;

         while (set.contains((int) val)) {
                currStreak++;
                val = val * val; 
                if (val > Integer.MAX_VALUE) break;
            }
     maxStreak = Math.max(maxStreak, currStreak);
}
return maxStreak == 1?-1:maxStreak;
    }
}
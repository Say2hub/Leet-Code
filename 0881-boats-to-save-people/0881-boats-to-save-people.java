class Solution {
    public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int left = 0, right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                // If the lightest and heaviest person can share a boat
                left++;
            }
            // In any case, the heaviest person gets on a boat
            right--;
            boats++;
        }

        return boats;
    }
}
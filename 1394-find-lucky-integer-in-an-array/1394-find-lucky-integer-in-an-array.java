import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr); 
        int n = arr.length;
        int count = 1;  
        int max_count = -1; 

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                if (arr[i - 1] == count) {
                    max_count = Math.max(arr[i - 1], max_count);
                }
                count = 1;
            }
        }

        if (arr[n - 1] == count) {
            max_count = Math.max(arr[n - 1], max_count);
        }

        return max_count;
    }
}

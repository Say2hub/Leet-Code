import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store the number and its index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
            
                return new int[] { map.get(complement), i };
            }
            
            // Store the index of the current number
            map.put(nums[i], i);
        }
        
        // If no solution found, this line should not be reached according to the problem statement
        throw new IllegalArgumentException("No two sum solution");
    }
}



class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the target value
        System.out.println("Enter target value:");
        int target = sc.nextInt();
        
        // Read the length of the array
        System.out.println("Enter length of the array:");
        int len = sc.nextInt();
        
        // Initialize the array
        int[] arr = new int[len];
        System.out.println("Enter array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Create an instance of Solution and call twoSum
        Solution s = new Solution();
        try {
            int[] result = s.twoSum(arr, target);
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        // Close the scanner
        sc.close();
    }
}

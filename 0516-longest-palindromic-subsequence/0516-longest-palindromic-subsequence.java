class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        Integer[][] dp = new Integer[n][n];
        return lengthPalind(0, n - 1, s, dp);
    }
    // This is a recursive function that will update start and end pointer
    //It will return the length of Longest palindromic subsequence using recursive calls
    //Untill start = end which means we are at the middle element of the string
    //We will return 1 from there, which will be passed to previous function calls and returned to the main function
    private int lengthPalind(int start, int end, String s, Integer[][] dp) {
        // Base cases
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return 1;
        }
        
        // Check if already computed
        if (dp[start][end] != null) {
            return dp[start][end];
        }
        
        // If characters match, include them and recurse
        if (s.charAt(start) == s.charAt(end)) {
            dp[start][end] = 2 + lengthPalind(start + 1, end - 1, s, dp);
        } else {
            // Take maximum of skipping start or end
            dp[start][end] = Math.max(
                lengthPalind(start + 1, end, s, dp),
                lengthPalind(start, end - 1, s, dp)
            );
        }
        
        return dp[start][end];
    }
}
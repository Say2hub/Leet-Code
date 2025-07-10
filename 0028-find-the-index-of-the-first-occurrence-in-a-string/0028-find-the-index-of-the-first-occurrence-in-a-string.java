class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        for (int i = 0; i <= hLen - nLen; i++) {
            int j;
            // Compare characters one by one
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // If all characters matched
            if (j == nLen) {
                return i;
            }
        }

        return -1;
    }
}
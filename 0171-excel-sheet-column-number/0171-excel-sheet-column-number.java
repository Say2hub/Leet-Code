class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        char[] letters = columnTitle.toCharArray();
        
        for (int i = 0; i < letters.length; i++) {
            int charValue = letters[i] - 'A' + 1;
            result = result * 26 + charValue;
        }
        
        return result;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
    char[] charArray1 = s.replace(" ", "").toLowerCase().toCharArray();
    char[] charArray2 = t.replace(" ", "").toLowerCase().toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray1, charArray2);
    }
}
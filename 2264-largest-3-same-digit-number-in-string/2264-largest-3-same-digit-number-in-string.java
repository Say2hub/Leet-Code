class Solution {
    public String largestGoodInteger(String num) {
         String result = ""; // will store the largest triplet found

        for (int i = 0; i <= num.length() - 3; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                String candidate = num.substring(i, i + 3);
                if (candidate.compareTo(result) > 0) {
                    result = candidate;
                }
            }
        }
    return result;
    }
}
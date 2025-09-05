class Solution {
    public List<String> letterCombinations(String digits) {
    ArrayList<String> list = new ArrayList<>();
    if (digits == null || digits.length() == 0) return list; 
    String[] mapping = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
    return PhonePad("", digits, mapping);
    }

    static ArrayList<String> PhonePad(String p, String up, String[] mapping) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        String letters = mapping[digit];
        ArrayList<String> internal = new ArrayList<>();
        for (char ch : letters.toCharArray()) {
            internal.addAll(PhonePad(p + ch, up.substring(1), mapping));
        }
        return internal;
    }
}
class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = 0;
            switch (s.charAt(i)) {
                case 'I': val = 1; break;
                case 'V': val = 5; break;
                case 'X': val = 10; break;
                case 'L': val = 50; break;
                case 'C': val = 100; break;
                case 'D': val = 500; break;
                case 'M': val = 1000; break;
            }
            
            if (val < prev) {
                sum -= val;
            } else {
                sum += val;
            }
            prev = val; 
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine();
        
        Solution solution = new Solution();
        int result = solution.romanToInt(roman);
        
        System.out.println("Integer value: " + result);
    }
}
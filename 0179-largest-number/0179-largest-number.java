class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String [] str = new String[n];
        for(int i=0;i<n;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        if (str[0].equals("0")) {
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(String num:str){
            largest.append(num);
        }
    return largest.toString();
    }
}
class Solution {
    public boolean isPalindrome(String s) {
       String res = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
       //Two pointer approach
       int left = 0;
       int right = res.length()-1;
       StringBuilder sb = new StringBuilder();
       while(left<right){
        if(res.charAt(left)!=res.charAt(right)){
            return false;
        }
        else{
            left++;
            right--;
        }
    }
    return true;
}
}
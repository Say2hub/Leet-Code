class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.isEmpty()){
        return true;
       }
       if(t.isEmpty()){
        return false;
       }
       char ch1 = s.charAt(0);
       char ch2 = t.charAt(0);
       if(ch1 == ch2){
        return isSubsequence(s.substring(1),t.substring(1));
       }else{
        return isSubsequence(s,t.substring(1));
       }
    }
}
class Solution {
    public int canBeTypedWords(String text, String brokenLetters){
        return brokenKeys(text,brokenLetters);
        
    }
    private int brokenKeys(String text , String brokenLetters){
        if(text.isEmpty()){
            return 0;
        }
        int index = text.indexOf(' ');
        String firstword;
        String rest;
        if(index==-1){
           firstword = text;
           rest = "";
        }else{
            firstword = text.substring(0,index);
            rest = text.substring(index+1);
        }
        Set<Character> hash = new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            char ch = brokenLetters.charAt(i);
            hash.add(ch);
        }
        for(int i=0;i<firstword.length();i++){
            char ch = firstword.charAt(i);
            if(hash.contains(ch)){
                return brokenKeys(rest,brokenLetters);
            }
        }
        int count = 1 + brokenKeys(rest,brokenLetters);
        return count;
    }

}
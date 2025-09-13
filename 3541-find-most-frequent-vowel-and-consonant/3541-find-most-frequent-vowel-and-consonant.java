class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
    Set<Character> hash = new HashSet<>();
    int max_vowel = 0;
    int max_consonant = 0;
    for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        hash.add(ch);
    }
    for(char ch:hash){
        if("aeiou".indexOf(ch)!=-1){
           int vowel = map.get(ch);
           max_vowel = Math.max(max_vowel,vowel);
        }else{
        int consonant = map.get(ch);
        max_consonant = Math.max(max_consonant,consonant);
        }
    }
    return max_vowel+max_consonant;
    }
}
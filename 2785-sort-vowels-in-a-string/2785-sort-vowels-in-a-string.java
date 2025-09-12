class Solution {
    public String sortVowels(String s) {
         LinkedList<Character> list = new LinkedList<>();
         for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if ("AEIOUaeiou".indexOf(ch) != -1) {
             list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                sb.append(list.get(0));
                list.remove(0);
            }else{
                sb.append(ch);
            }
        }
    return sb.toString();
    }
}
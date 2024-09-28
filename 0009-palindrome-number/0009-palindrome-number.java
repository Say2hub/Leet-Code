class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int sum=0;
        int rev_num=0;
        int n=x;
        while(n>0){
            rev_num=n%10;
            sum=sum*10+rev_num;
            n=n/10;
        }
        if(sum==x)  return true;
        
        else return false;
        
        
        
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        Solution s = new Solution();
        s.isPalindrome(x);
    }
}
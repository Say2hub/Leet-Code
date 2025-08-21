class Solution {
    public int climbStairs(int n) {
        int[] fibb = new int[n+1];
        int first = 1;
        int second = 1;
        if(n<=1) return 1;
        for(int i=2;i<=n;i++){
            fibb[i]=first+second;
            first=second;
            second=fibb[i];
        }
    return second;
    }
}
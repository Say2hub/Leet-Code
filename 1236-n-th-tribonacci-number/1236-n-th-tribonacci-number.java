class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        int temp=0;
        for(int i = 2;i<=n;i++){
            temp = a+b+c;
            a=b;
            b=c;
            c=temp;
        }
    int result=b;
    return result;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        s.tribonacci(n);
    }
}
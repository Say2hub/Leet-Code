class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){
            int temp = a+b;
            a = b;
            b=temp;
        }
        return a;

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution s = new Solution();
        int res = s.fib(n);
        System.out.println(res); 
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k){
        List <Integer> ans = new ArrayList<>();
        int p = num.length-1;//Last element of num array
        int carry = 0;
        while(p>=0||k>0){
            int numval = 0;
            if(p>=0){
                numval=num[p];
            }
            int digit = k%10;
            int sum = numval+digit+carry;
            int d = sum%10;
            carry = sum/10;
            ans.add(d);
            p--;
            k=k/10;
        }

        if(carry>0){
            ans.add(carry);
        }

        Collections.reverse(ans);//Reverse the ans as add appends at the last
        return ans;
        
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] num = new int[x];
        //Enter the elements of array
        for(int i=1;i<x;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be added:");
        int k = sc.nextInt();
        Solution s = new Solution();
        s.addToArrayForm(num,k);
    }
}
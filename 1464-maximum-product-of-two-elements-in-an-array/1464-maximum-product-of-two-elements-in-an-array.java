class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int res;
                res=(nums[i]-1)*(nums[j]-1);
                if(res>max){
                    max=res;
                }
            }
        }
    return max;  
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //enter length of array
        int k = in.nextInt();
        int [] nums = new int[k];//Array Declaration
        Solution s = new Solution();
        int maximum=s.maxProduct(nums);
        System.out.println(maximum);

    }
}
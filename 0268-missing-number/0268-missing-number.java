class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int miss = len;
        for(int i=0;i<len;i++){
            if(i!=nums[i]){
                miss=i;
                break;
            }
        }
    return miss;

    }
}
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //array length
        int k = in.nextInt();
        int [] nums = new int[k];
        Solution s = new Solution();
        int result = s.missingNumber(nums);
        System.out.println(result);
    }
}
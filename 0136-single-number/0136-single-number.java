class Solution {
    public int singleNumber(int[] nums) {
      //XOR Operation
      /*
      a^a=0;
      a^0=a;
      */
      int num = 0;
      for(int i:nums){
        num=num^i;
      }
      return num;

    }
        
}

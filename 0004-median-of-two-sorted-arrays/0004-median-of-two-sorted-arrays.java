class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int c = a+b;
        int [] add = new int[c];
        //Add elements of a to c
        for(int i=0;i<a;i++){
            add[i]=nums1[i];
        }
        //Add elements of b to c
        for(int j=0;j<b;j++){
            add[a+j]=nums2[j];
        }
        Arrays.sort(add);
        double median = 0;
        //Find median of odd number of elements
        if(c%2==1){
          median = add[c/2];
            return median;
        }
        else {
            double mid1=  add[(c-1)/2];
            double mid2 = add[c/2];
            median = (mid1+mid2)/2;
        }
        return median;
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int k = in.nextInt();
        int [] f = new int[m];
        int [] s = new int[k];
        //First array input
        for(int i=0;i<m;i++){
            f[i]=in.nextInt();
        }
        for(int j=0;j<k;j++){
            s[j]=in.nextInt();
        }

        Solution obj = new Solution();
        double res = obj.findMedianSortedArrays(f,s);
        System.out.println(res);
    }
}
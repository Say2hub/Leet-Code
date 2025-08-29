class Solution {
    public long flowerGame(int n, int m) {
        int odd_countx = 0;
        int odd_county = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                odd_countx++;
            }
        }
        for(int i=1;i<=m;i++){
            if(i%2!=0){
                odd_county++;
            }
        }
        int even_countx = n-odd_countx;
        int even_county = m-odd_county;

        int ans = (odd_countx*even_county)+(odd_county*even_countx);
        return ans;
    }
}
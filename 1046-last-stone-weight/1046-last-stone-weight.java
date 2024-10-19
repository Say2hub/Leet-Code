class Solution {
    public int lastStoneWeight(int[] stones) {
    PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int ele:stones) {
        pq.add(ele);
    }
    while(pq.size()>1){
        int max = pq.remove();
        int smax = pq.remove();
        int new_ele = max-smax;
        if(new_ele!=0){
            pq.add(new_ele);
        }
    }
    if(pq.size()==0) return 0;
    else return pq.remove();
    }
}
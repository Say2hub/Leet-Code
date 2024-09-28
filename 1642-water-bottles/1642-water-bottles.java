class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drink_bottles = numBottles;
        int empty_bottles = numBottles;
        while (empty_bottles >= numExchange) {
            int exchanged_bottles = empty_bottles / numExchange;
            drink_bottles += exchanged_bottles;
            empty_bottles = exchanged_bottles + (empty_bottles %numExchange);
        }
        return drink_bottles;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution s = new Solution();
        int res = s.numWaterBottles(a, b);
        System.out.println("Number of water bottles you can drink: " + res);
    }
}
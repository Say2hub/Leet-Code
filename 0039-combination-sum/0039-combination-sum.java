class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }
    private void backtrack(int[] candidates, int target, List<Integer> temp, List<List<Integer>> result, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                temp.add(candidates[i]);
                backtrack(candidates, target - candidates[i], temp, result, i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
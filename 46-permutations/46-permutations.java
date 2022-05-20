class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length == 0) {
            return res;
        }

        backtracking(nums, nums.length, new ArrayList<>(), res);
        return res;
    }

    private static void backtracking(int[] nums, int depth, List<Integer> tmp, List<List<Integer>> res) {
        if (depth == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tmp.contains(nums[i])) {
                continue;
            }
            tmp.add(nums[i]);
            backtracking(nums, depth - 1, tmp, res);;
            tmp.remove(tmp.size() - 1);
        }
    }
}
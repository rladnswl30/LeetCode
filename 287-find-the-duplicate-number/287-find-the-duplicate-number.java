class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visit = new boolean[nums.length];

        for (int num : nums) {
            if (visit[num]) {
                return num;
            } else {
                visit[num] = true;
            }
        }

        return 0;
    }
}
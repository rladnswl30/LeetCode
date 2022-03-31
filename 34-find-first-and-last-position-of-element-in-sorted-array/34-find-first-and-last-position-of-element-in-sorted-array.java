class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        search(nums, target, 0, nums.length - 1, res);
        return res;
    }

    public static void search(int[] nums, int target, int left, int right, int[] res) {
        if (left > right) {  // cannot find target
            return;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) {  // find target
            res[0] = res[0] == -1 ? mid : Math.min(res[0], mid);
            res[1] = Math.max(res[1], mid);

            if (mid - 1 >= 0 && nums[mid - 1] == target) { // search left
                search(nums, target, left, mid - 1, res);
            } else { // search right
                search(nums, target,mid + 1, right, res);
            }
        }

        if (nums[mid] > target) { // search left
            search(nums, target, left, mid - 1, res);
        } else { // search right
            search(nums, target, mid + 1, right, res);
        }
    }
}
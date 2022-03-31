class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[left] <= nums[mid]) { // left 탐색
            if (nums[left] <= target && target <= nums[mid]) { // target contains left
                return binarySearch(nums, target, left, mid - 1);
            } else { // target contains right
                return binarySearch(nums, target,mid + 1, right);
            }
        } else { // right 탐색
            if (nums[mid] <= target && target <= nums[right]) { // target contains right
                return binarySearch(nums, target, mid + 1, right);
            } else { // target contains left
                return binarySearch(nums, target, left, mid - 1);
            }
        }
    }
}
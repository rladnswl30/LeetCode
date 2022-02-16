class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int start = 0;
        int end = height.length - 1;
        while (start < end) {
            max = Math.max(Math.min(height[start], height[end]) * (end - start), max);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }
}
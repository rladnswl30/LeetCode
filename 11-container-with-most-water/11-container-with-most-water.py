class Solution:
    def maxArea(self, height: List[int]) -> int:
        result = 0
        start = 0
        end = len(height) - 1
        
        while start < end:
            result = max(min(height[start], height[end]) * (end - start), result)
            
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1

        return result
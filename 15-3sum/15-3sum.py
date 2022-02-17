class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        # print(nums)

        for i, val in enumerate(nums):
            if i > 0 and val == nums[i - 1]:
                continue

            left = i + 1
            right = len(nums) - 1

            while left < right:
                allSum = val + nums[left] + nums[right]
                if allSum < 0:
                    left += 1
                elif allSum > 0:
                    right -= 1
                else:
                    res.append([val, nums[left], nums[right]])
                    left += 1
                    right -= 1
                    while nums[left - 1] == nums[left] and left < right:
                        left += 1
                    while nums[right + 1] == nums[right] and left < right:
                        right -= 1

        return res
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        m = len(nums)
        k %= m 
        nums[:] = nums[-k:] + nums[:-k] 
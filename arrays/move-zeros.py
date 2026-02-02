# NOTE - First approach
from typing import List
# class Solution:
#     def moveZeroes(self, nums: List[int]) -> None:
#         """
#         Do not return anything, modify nums in-place instead.
#         """
#         nums2 : List[int]=[]
#         count = 0

#         for i in range(len(nums)):
#             if(nums[i] != 0):
#                 nums2.append(nums[i])
#             else:
#                 count = count + 1

#         if(count>0):
#             for i in range(count):
#                 nums2.append(0)
        

#         for i in range(len(nums)):
#             nums[i]= nums2[i]



# NOTE - Two pointer approach
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        k = 0  # position for next non-zero

        for i in range(len(nums)):
            if nums[i] != 0:
                nums[k] = nums[i]
                k += 1

        # fill remaining with zero
        for i in range(k, len(nums)):
            nums[i] = 0

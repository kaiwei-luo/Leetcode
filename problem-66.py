# https://leetcode.com/problems/plus-one/submissions/

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        for i in range(len(digits) - 1, -1, -1):
            if digits[i] + 1 == 10:
                digits[i] = 0
            else:
                digits[i] += 1
                break
        if digits[0] == 0:
            digits.insert(0, 1)
        return digits
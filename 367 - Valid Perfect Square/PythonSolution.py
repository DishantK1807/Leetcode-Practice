class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        if not num or num < 1:
            return False
        if num == 1:
            return True
        left = 1
        right = num

        while left < right:
            mid = left + (right-left)//2
            sq = mid * mid
            if sq == num:
                return True
            if sq < num:
                left = mid + 1
            else:
                right = mid
        return False
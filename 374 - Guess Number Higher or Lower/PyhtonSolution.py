# The guess API is already defined for you.
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num: int) -> int:

class Solution:
    def guessNumber(self, n: int) -> int:
        right = n
        left = 1

        while(left < right):
            mid = left + (right-left)//2
            res = guess(mid)
            if (res == 0):
                return mid
            elif res < 0:
                right = mid
            else:
                left = mid + 1


        if guess(left) == 0:
            return left
        else:
            return guess(left)

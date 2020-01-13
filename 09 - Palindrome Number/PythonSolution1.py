class Solution:
    def isPalindrome(self, x: int) -> bool:
        if (x < 0 or (x % 10 == 0 and x != 0)):
            return False

        result = False
        rev = 0
        val = x

        while(x != 0):
            temp = x % 10
            x = x // 10
            rev = (rev * 10) + temp

        if (val == rev):
            result = True

        return result
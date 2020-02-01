class Solution:
    def validPalindrome(self, s: str) -> bool:
        left = 0
        right = len(s) - 1
        while(left < right):
            if(s[left] != s[right]):
                a = s[left:right]
                b = s[left + 1:right + 1]
                return a == a[::-1] or b == b[::-1]

            else:
                left += 1
                right -= 1


        return True
class Solution:
    def longestPalindrome(self, s: str) -> int:
        chars = [0] * 128
        count = 0
        for c in s:
            chars[ord(c)] += 1
            if((chars[ord(c)]) == 2):
                count += 2
                chars[ord(c)] = 0

        return count if count == len(s) else count + 1
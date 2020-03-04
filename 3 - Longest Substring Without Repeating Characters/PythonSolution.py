class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        length = len(s)
        lcs = {}
        max_len = 0
        i = 0

        for j in range(length):
            if s[j] in lcs:
                i = max(lcs[s[j]], i)

            max_len = max(max_len, j - i + 1)
            lcs[s[j]] = j+1

        return max_len
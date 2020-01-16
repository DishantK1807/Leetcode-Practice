class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if not strs:
            return ""

        s1 = min(strs) # stores smallest string
        s2 = max(strs) # stores largest string

        for i, c in enumerate(s1):
            if c != s2[i]:
                return s1[:i]


        return s1
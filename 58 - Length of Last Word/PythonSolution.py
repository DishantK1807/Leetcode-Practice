class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        if not s:
            return 0

        strs = s.split()
        if (len(strs) == 0):
            return 0

        return len(strs[len(strs) - 1])
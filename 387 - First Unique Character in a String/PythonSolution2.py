class Solution:
    def firstUniqChar(self, s: str) -> int:
        char_arr = [0] * 26
        size = len(s)

        for c in s:
            char_arr[ord(c) - ord('a')] += 1

        for i in range(size):
            if char_arr[ord(s[i]) - ord('a')] == 1:
                return i

        return -1
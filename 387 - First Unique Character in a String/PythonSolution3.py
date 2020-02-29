class Solution:
    def firstUniqChar(self, s: str) -> int:
        set_ = set()
        for i in range(len(s)):
            if s[i] not in set_:
                tmp = s[:i] + s[i+1:]
                if s[i] not in tmp:
                    return i
                set_.add(s[i])
        return -1
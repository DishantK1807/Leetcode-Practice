class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        haystack_len = len(haystack)
        frame_len = len(needle)

        if needle == haystack:
            return 0

        for i in range(haystack_len - frame_len + 1):
            if needle == haystack[i: i + frame_len]:
                return i


        return -1
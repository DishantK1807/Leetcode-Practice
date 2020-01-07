class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        chars, start, end = s, 0, len(s)-1
        while start < end:
            chars[start], chars[end] = chars[end], chars[start]
            start += 1
            end -= 1
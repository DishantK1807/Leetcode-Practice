class Solution:
    def helper(self, start: int, string: List[str], end: int) -> None:

        if start >= end:
            return

        else:
            temp = string[start]
            string[start] = string[end]
            string[end] = temp
            self.helper(start + 1, string, end - 1)


    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        self.helper(0, s, len(s) - 1)
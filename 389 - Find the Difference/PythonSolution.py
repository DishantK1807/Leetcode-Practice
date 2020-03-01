class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        char_arr = [0] * 26
        index = 0

        for c in s:
            char_arr[ord(c) - ord('a')] += 1

        for c in t:
            char_arr[ord(c) - ord('a')] -= 1
            if char_arr[ord(c) - ord('a')] < 0:
                break

            index += 1

        return t[index]

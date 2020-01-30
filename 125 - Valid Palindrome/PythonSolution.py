class Solution:
    def isPalindrome(self, s: str) -> bool:
        if (s == None and len(s) == 0):
            return True
        s = s.lower()
        new_str = [char for char in s if char.isalnum()]
        return new_str[::-1] == new_str
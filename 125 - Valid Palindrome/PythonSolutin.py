class Solution:
    def isPalindrome(self, s: str) -> bool:
        if (s == None and len(s) == 0):
            return True

        start = 0
        end = len(s) - 1
        mid = len(s) // 2
        while (start < end and start < mid):
            while(not(s[start].isalnum()) and start < mid):
                print("yes")
                start += 1
            while(not(s[end].isalnum()) and end >= mid):
                end -= 1

            if (start < mid and end >= mid):
                if (s[start].lower() != s[end].lower()):
                    return False

            start += 1
            end -= 1


        return True
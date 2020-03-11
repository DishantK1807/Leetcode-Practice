class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        str1 = num1.split()
        str2 = num2.split()
        n1 = 0
        n2 = 0
        for c in str1:
            n1 = n1*10 + int(c)

        for c in str2:
            n2 = n2*10 + int(c)

        return(str(n1+n2))
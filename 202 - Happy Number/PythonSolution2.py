class Solution:
    def isHappy(self, n: int) -> bool:
        values = [n]

        while(True):
            n = sum([int(s)**2 for s in list(str(n))])
            if n == 1:
                return True
            elif n in values:
                return False
            else:
                values.append(n)
class Solution:
    def addDigits(self, num: int) -> int:
        if num < 10:
            return num

        while (num // 10 != 0):
            res = 0
            val = 0
            while(num != 0):
                val = num % 10
                res += val
                num = num // 10

            num = res


        return num
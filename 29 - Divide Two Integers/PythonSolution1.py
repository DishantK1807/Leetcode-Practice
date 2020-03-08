import sys

sys.setrecursionlimit(1500)

class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        pos = False

        if ((dividend > 0 and divisor > 0) or (dividend < 0 and divisor < 0)):
            pos = True

        multiple = self.dividendWrapper(abs(dividend), abs(divisor))

        if (pos):
            if multiple > 2147483647:
                return 2147483647

            else:
                return int(multiple)

        else:
            if 0 - multiple < -2147483648:
                return 2147483647

            else:
                return 0 - int(multiple)



    def dividendWrapper(self, dividend: float, divisor: float) -> float:
        if dividend < divisor:
            return 0

        sum_val = divisor
        multiple = 1

        while((sum_val + sum_val) <= dividend):
            sum_val += sum_val
            multiple += multiple

        return multiple + self.dividendWrapper(dividend - sum_val, divisor)
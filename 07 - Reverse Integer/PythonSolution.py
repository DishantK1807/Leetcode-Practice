class Solution:
    def reverse(self, x: int) -> int:
        rev = 0
        temp = 0
        sign = False
        max_value = pow(2,31) // 10
        if (x < 0):
            sign = True
            x = abs(x)

        while(x != 0):
            temp = x % 10
            x = x // 10

            if rev > max_value or (rev == max_value and temp > 7):
                return 0

            rev = (rev * 10) + temp

        if sign:
            rev = rev * (-1)

        return rev
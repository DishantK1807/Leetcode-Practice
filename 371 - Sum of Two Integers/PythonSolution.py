class Solution:
    def getSum(self, a: int, b: int) -> int:
        # 32 bits integer max
        MAX = 0x7FFFFFFF
        # 32 bits interger min
        MIN = 0x80000000
        # mask to get last 32 bits
        mask = 0xFFFFFFFF
        # Iterate till there is no carry
        while b != 0:
            carry = a & b
            a = (a ^ b) & mask
            b = (carry << 1) & mask

        if a<=MAX:
            return a
        else:
            return ~(a ^ mask)
class Solution:
    def isHappy(self, n: int) -> bool:
        slow = n
        fast = n
        while(True):
            slow = self.next(slow)
            fast = self.next(self.next(fast))

            if (slow == 1 or fast == 1):
                return True
            if (slow == fast):
                return False


    def next(self, n: int) -> int:
        res = 0
        val = 0

        while(n > 0):
            val = n % 10
            res += val**2
            n = n // 10

        return res


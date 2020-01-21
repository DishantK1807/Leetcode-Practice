class Solution:
    def mySqrt(self, x: int) -> int:
        if (x == 0 or x == 1):
            return x
        start = 1.0
        end = x / 2
        ans = 0.0

        while(start <= end):
            mid = float(start + ((end-start)// 2))
            if (mid * mid == x):
                return int(mid)
            if (mid * mid < x):
                start = mid + 1
                ans = mid
            else:
                end = mid - 1

        return math.floor(ans)

class Solution:
    def mySqrt(self, x: int) -> int:
        if (x == 0 or x == 1):
            return x

        estimate = x / 1000
        prev_estimate = 0.0

        while(prev_estimate != estimate):
            prev_estimate = estimate
            estimate = (estimate + x / estimate) / 2

        return int(estimate)

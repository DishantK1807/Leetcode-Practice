class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        result = {}
        remainder = 0
        length = len(numbers)
        for i in range(length):
            remainder = target - numbers[i]
            if remainder in result:
                return [result[remainder] + 1, i + 1]

            result[numbers[i]] = i

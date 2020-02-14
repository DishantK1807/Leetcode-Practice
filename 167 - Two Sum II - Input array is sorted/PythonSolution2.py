class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        result = [0, 0]
        start = 0
        end = len(numbers) - 1

        while (start <= end):
            if (numbers[start] + numbers[end] < target):
                start += 1
            elif (numbers[start] + numbers[end] > target):
                end -= 1
            else:
                result[0] = start + 1
                result[1] = end + 1
                return result

        return result
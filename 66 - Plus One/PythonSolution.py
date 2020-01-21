class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        length = len(digits);
        carry = 0;
        i = length - 1
        while i >= 0:
            if i == length - 1:
                digits[i] = digits[i] + carry + 1
            else:
                digits[i] += carry

            if carry != 0:
                carry = 0

            if digits[i] > 9:
                carry = 1
                digits[i] = digits[i] - 10

            if carry == 0:
                break

            i -= 1


        if (carry != 0):
            new_digits = [];
            new_digits.append(carry)
            for i in range(1, length+1):
                new_digits.append(digits[i-1])

            return new_digits


        return digits
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 0;
        for (int i = len -1; i >= 0; i--){
            if(i == len -1)
                digits[i] = digits[i] + carry + 1;

            else
                digits[i] += carry;

            if (carry != 0){
                carry = 0;
            }
            if (digits[i] > 9){
                carry = 1;
                digits[i] = digits[i] - 10;
            }

            if (carry == 0)
                break;
        }

        if (carry != 0){
            int[] new_digits = new int[len + 1];
            new_digits[0] = carry;
            for(int i = 1; i< len +1; i++){
                new_digits[i] = digits[i-1];
            }

            return new_digits;
        }


        return digits;
    }
}
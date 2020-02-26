class Solution {
    public int addDigits(int num) {
        int val = 0;
        int sum = 0;
        while(num / 10 != 0){
            sum = 0;
            while (num != 0){
                val = num % 10;
                sum = sum + val;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}
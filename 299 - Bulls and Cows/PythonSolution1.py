class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        b_count = 0
        c_count = 0
        sec_arr = [0] * 10
        g_arr = [0] * 10

        for i in range(len(secret)):
            if(secret[i] == guess[i]):
                b_count += 1
            else:
                sec_arr[ord(secret[i]) - ord('0')] += 1
                g_arr[ord(guess[i]) - ord('0')] += 1

        for i in range(10):
            c_count += min(sec_arr[i], g_arr[i])

        string = [b_count, 'A', c_count, 'B']
        ret_string = ''.join([str(elem) for elem in string])
        return ret_string
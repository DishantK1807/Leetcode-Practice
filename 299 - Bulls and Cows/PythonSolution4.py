class Solution:
    def getHint(self, secret: str, guess: str) -> str:
        length = len(secret)

        if(len(guess) != length):
            return None

        s_map = {}
        g_map = {}
        b_count = 0
        c_count = 0

        for i in range(length):
            if (secret[i] == guess[i]):
                b_count += 1
            else:
                s_map[secret[i]] = s_map.get(secret[i], 0) + 1
                g_map[guess[i]] = g_map.get(guess[i], 0) + 1

        for (k,v) in g_map.items():
            c_count += min(v, s_map.get(k, 0))

        string = [b_count, 'A', c_count, 'B']
        ret_string = ''.join(map(str, string))

        return ret_string
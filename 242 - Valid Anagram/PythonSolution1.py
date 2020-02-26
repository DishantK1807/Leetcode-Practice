class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        char_map = {}
        s_len = len(s)
        t_len = len(t)

        if s_len != t_len:
            return False

        for i in s:
            if i in char_map:
                char_map[i] += 1
            else:
                char_map[i] = 1

        for i in t:
            if i in char_map:
                if char_map[i] == 0:
                    return False

                char_map[i] -= 1

            else:
                return False

        for (k, v) in char_map.items():
            if v != 0:
                return False


        return True
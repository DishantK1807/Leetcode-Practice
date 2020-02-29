class Solution:
    def firstUniqChar(self, s: str) -> int:
        if (s == None or len(s) == 0):
            return -1

        count = {}
        index = {}
        indx = 0
        min_index = 999999
        for c in s:
            if c in count:
                count[c] += 1
            else:
                count[c] = 1
                index[c] = indx

            indx += 1

        for (k,v) in count.items():
            if v == 1:
                min_index = min(min_index, index[k])

        return -1 if min_index == 999999 else min_index

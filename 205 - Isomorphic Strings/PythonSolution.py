class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = {}
        length = len(s)

        for i in range(length):
            if s[i] in mapping:
                if (mapping[s[i]] == t[i]):
                    pass
                else:
                    return False

            else:
                for a,b in mapping.items():
                    if b == t[i]:
                        return False

                mapping[s[i]] = t[i]

        return True

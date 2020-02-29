class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        r_arr = [0] * 26
        m_arr = [0] * 26

        for i in ransomNote:
            r_arr[ord(i) - ord('a')] += 1

        for i in magazine:
            m_arr[ord(i) - ord('a')] += 1

        for i in range(26):
            if r_arr[i] > m_arr[i]:
                return False


        return True
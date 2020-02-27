class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        word_map = {}
        words = str.split(" ")
        if len(pattern) != len(words):
            return False

        for i in range(len(pattern)):
            if pattern[i] in word_map:
                if(word_map[pattern[i]] != words[i]):
                    return False

            else:
                for (k,v) in word_map.items():
                    if (v == words[i]):
                        return False

                word_map[pattern[i]] = words[i]

        return True
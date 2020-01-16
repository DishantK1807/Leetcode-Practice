class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        min_len = math.pow(2,31)
        result = ""

        for string in strs:
            if (min_len > len(string)):
                min_len = len(string)
                result = string

        for string in strs:
            if(result == string[:min_len]):
                pass
            else:
                while(min_len > 0  and  not(result == string[:min_len])):
                    min_len -= 1
                    result = result[:min_len]



        return result
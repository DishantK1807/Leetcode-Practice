class Solution:
    def romanToInt(self, s: str) -> int:
        num = 0
        i = 0
        I = 1
        V = 5
        X = 10
        L = 50
        C = 100
        D = 500
        M = 1000
        str_list = list(s)
        str_len = len(str_list)

        while(i < str_len):
            if (str_list[i] == 'I'):
                if ( i + 1 < str_len and str_list[i+1] == 'V' ):
                    num = num + V - I
                    i = i + 1
                elif (i + 1 < str_len and str_list[i+1] == 'X'):
                    num = num + X - I
                    i = i + 1
                else:
                    num = num + I

            elif (str_list[i] == 'V'):
                num = num + V

            elif (str_list[i] == 'X'):
                if (i + 1 < str_len and str_list[i+1] == 'L'):
                    num = num + L - X
                    i = i+1
                elif (i + 1 < str_len and str_list[i+1] == 'C'):
                    num = num + C - X
                    i = i + 1
                else:
                    num = num + X

            elif (str_list[i] == 'L'):
                num = num + L

            elif (str_list[i] == 'C'):
                if (i + 1 < str_len and str_list[i+1] == 'D'):
                    num = num + D - C
                    i = i+1
                elif (i + 1 < str_len and str_list[i+1] == 'M'):
                    num = num + M - C
                    i = i + 1
                else:
                    num = num + C

            elif (str_list[i] == 'D'):
                num = num + D

            elif (str_list[i] == 'M'):
                num = num + M

            else:
                print("Invalid Character")

            i = i + 1

        return num
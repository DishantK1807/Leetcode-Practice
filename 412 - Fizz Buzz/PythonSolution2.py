class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        ret_list = []
        for i in range(1,n+1):
            div_by_5 = i % 5 == 0
            div_by_3 = i % 3 == 0
            if div_by_5 and div_by_3:
                ret_list.append("FizzBuzz")
            elif div_by_5:
                ret_list.append("Buzz")
            elif div_by_3:
                ret_list.append("Fizz")
            else:
                ret_list.append(str(i))

        return ret_list
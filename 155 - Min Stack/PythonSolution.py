class MinStack:
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.lst = []
        self.min_ind = 0

    def push(self, x: int) -> None:
        self.lst.append(x)
        if x<self.lst[self.min_ind]:
            self.min_ind = len(self.lst)-1

    def pop(self) -> None:
        del self.lst[-1]
        if self.min_ind>len(self.lst)-1 and len(self.lst)>0:
            self.min_ind = self.lst.index(min(self.lst))

    def top(self) -> int:
        return self.lst[-1]

    def getMin(self) -> int:
        return self.lst[self.min_ind]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
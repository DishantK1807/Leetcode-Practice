class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.list = []
        self.min = []


    def push(self, x: int) -> None:
        if self.min == [] or x <= self.min[-1]:
            self.min.append(x)
        self.list.append(x)


    def pop(self) -> None:
        popped = self.list.pop()
        if popped == self.min[-1]:
            self.min.pop()


    def top(self) -> int:
        return self.list[-1]


    def getMin(self) -> int:
        return self.min[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
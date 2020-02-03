# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrderBottom(self, root: TreeNode) -> List[List[int]]:
        list_dict = dict()

        if root is None:
            return []

        queue = [(root, 0)]

        while(len(queue) != 0):
            data = queue.pop(0)

            if data[1] not in list_dict:
                list_dict[data[1]] = [data[0].val]

            else:
                list_dict[data[1]].append(data[0].val)

            if data[0].left is not None:
                queue.append((data[0].left, data[1] + 1))
            if data[0].right is not None:
                queue.append((data[0].right, data[1] + 1))

            depth = data[1]


        result = list()
        for i in reversed(range(depth+1)):
            result.append(list_dict[i])

        return result
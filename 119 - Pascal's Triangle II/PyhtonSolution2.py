class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        if rowIndex < 0:
            return []

        pascal_row = []

        pascal_row.append(1)

        top = rowIndex
        bottom = 1
        val = 1

        for i in range(1, rowIndex+1):
            val = val * top
            val = val // bottom
            pascal_row.append(val)
            top -= 1
            bottom += 1


        return pascal_row
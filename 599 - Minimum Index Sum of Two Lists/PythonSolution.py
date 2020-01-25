class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:

        result = []
        map1 = {}
        map2 = {}
        minValue = 10000

        for i in range(len(list1)):
            map1[list1[i]] = i

        for i in range(len(list2)):
            map2[list2[i]] = i


        for i in range(len(list1)):
            if list1[i] in map2.keys():
                sumValue = map1[list1[i]] + map2[list1[i]]
                if sumValue < minValue:
                    minValue = sumValue
                    result.append(list1[i])
                elif sumValue == minValue:
                    result.append(list1[i])

        return result

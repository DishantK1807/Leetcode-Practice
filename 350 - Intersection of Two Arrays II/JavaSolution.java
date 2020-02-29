class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums1){
            if(map.containsKey(ele)){
                map.replace(ele, map.get(ele) + 1);
            }
            else{
                map.put(ele, 1);
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int ele : nums2){
            if (map.containsKey(ele)){
                if(map.get(ele) > 0){
                    result.add(ele);
                    map.replace(ele, map.get(ele) - 1);
                }
            }
        }

        int[] res = new int[result.size()];
        int index = 0;

        for(int ele: result){
            res[index++] = ele;
        }

        return res;
    }
}
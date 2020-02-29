class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() ==0)
            return -1;

        HashMap<Character, Integer> count = new HashMap<>();
        HashMap<Character, Integer> index = new HashMap<>();
        int min_index = Integer.MAX_VALUE;
        int indx = 0;
        for(char c : s.toCharArray()){ //changes
            if(count.containsKey(c)){
                count.replace(c, count.get(c) + 1);
            }
            else{
                count.put(c, 1);
                index.put(c, indx);
            }

            indx++;
        }

        for(Map.Entry<Character, Integer> ele: count.entrySet()){
            if (ele.getValue() == 1){
                min_index = Math.min(min_index, index.get(ele.getKey()));
            }
        }

        return min_index == Integer.MAX_VALUE ? -1 : min_index;
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int s_len = s.length();
        int t_len = t.length();
        if (s_len != t_len)
            return false;

        for (int i = 0; i<s_len; i++){
            if (map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t_len; i++){
            if(map.containsKey(t.charAt(i))){
                if (map.get(t.charAt(i)) == 0){
                    return false;
                }
                else{
                    map.replace(t.charAt(i) , map.get(t.charAt(i)) - 1);
                }
            }

            else{
                return false;
            }
        }

        for(Map.Entry ele : map.entrySet()){
            if ((int)ele.getValue() != 0)
                return false;
        }

        return true;
    }
}
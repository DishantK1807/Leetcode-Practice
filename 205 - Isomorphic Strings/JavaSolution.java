class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        int len = s.length();

        for (int i = 0; i < len; i++){
            if(map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i)) == t.charAt(i)){
                    continue;
                }
                else
                    return false;
            }

            else{
                for(Map.Entry<Character,Character> entry : map.entrySet()){
                    if (t.charAt(i) == entry.getValue())
                        return false;
                }

                map.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}
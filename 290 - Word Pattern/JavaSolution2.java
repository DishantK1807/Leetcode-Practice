class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        String[] str_a = str.split(" ");

        if (pattern.length() != str_a.length)
            return false;

        for (int i = 0; i < pattern.length(); i++){
            if (map.containsKey(pattern.charAt(i))){
                if(!str_a[i].equals(map.get(pattern.charAt(i)))){
                    return false;
                }
            }

            else{

                for(Map.Entry<Character,String> entry : map.entrySet()){
                    if (str_a[i].equals(entry.getValue()))
                        return false;
                }

                map.put(pattern.charAt(i), str_a[i]);
            }

        }

        return true;
    }
}
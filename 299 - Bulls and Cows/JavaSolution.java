class Solution {
    public String getHint(String secret, String guess) {
        int l = secret.length();

        if(guess.length() != l) return null;

        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> gm = new HashMap<>();
        int bl = 0, cw = 0;

        for (int i = 0; i < l; i++){
            char c = secret.charAt(i);
            char d = guess.charAt(i);
            if (c == d) bl++;
            else {
                sm.put(c, sm.getOrDefault(c, 0) + 1);
                gm.put(d, gm.getOrDefault(d, 0) + 1);
            }
        }

        for (char c : gm.keySet()){
            cw += Math.min(gm.get(c), sm.getOrDefault(c, 0));
        }

        return bl + "A" + cw + "B";
    }
}
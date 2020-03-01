class Solution {
    public String getHint(String secret, String guess) {
        String str;
        int b_count = 0;
        int c_count = 0;
        int[] sec_arr = new int[10];
        int[] g_arr = new int[10];

        for(int i = 0; i < secret.length(); i++){
            if (secret.charAt(i) == guess.charAt(i))
                b_count++;
            else{
                sec_arr[secret.charAt(i) - '0']  +=1;
                g_arr[guess.charAt(i) - '0'] += 1;
            }
        }

        for(int i = 0; i < 10; i++){
            c_count += Math.min(sec_arr[i], g_arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(b_count);
        sb.append("A");
        sb.append(c_count);
        sb.append("B");

        return sb.toString();

    }
}
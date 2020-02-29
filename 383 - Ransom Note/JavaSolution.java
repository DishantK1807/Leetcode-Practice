class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int r_len = ransomNote.length();
        int m_len = magazine.length();

        int[] r_arr = new int[26];
        int[] m_arr = new int[26];

        for(int i = 0; i < r_len; i++){
            r_arr[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i < m_len; i++){
            m_arr[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < r_arr.length; i++){
            if(r_arr[i] > m_arr[i])
                return false;
        }

        return true;
    }
}
class Solution {
    public int kthGrammar(int N, int K) {
        if (N == 1){
            return 0;
        }

        if (N == 2){
            return K-1;
        }

        int val = kthGrammar(N - 1, ((K+1) / 2));
        if((K&1) == 1){
            return val;
        }

        else{
            return 1 - val;
        }
    }
}
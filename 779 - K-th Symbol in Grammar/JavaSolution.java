class Solution {
    public int kthGrammar(int N, int K) {
        long s = (long)Math.pow(2, N-1);
        long flips = 0;

        while(s > 2){
            if (K > (s/2)){
                K -= (s/2);
                flips++;
            }
            s = (s/2);
        }

        K--;

        if(flips % 2 == 1){
            K = 1 - K;
        }

        return K;
    }
}
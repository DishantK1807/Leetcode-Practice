class Solution {
    public int countPrimes(int n) {
        int count = 0;
        if (n <= 1)
            return 0;
        for(int i = 2; i<n; i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n){
        int root = (int) Math.sqrt(n);
        for(int i = 2; i <= root; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
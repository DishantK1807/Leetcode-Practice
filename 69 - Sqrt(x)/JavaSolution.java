class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        double estimate = (double) x/1000; // Try to start with a good approximation
        double previousEstimate = estimate;
        do{
            previousEstimate = estimate;
            estimate = (estimate + x / estimate) / 2.0;
        }while(previousEstimate!=estimate);
        return (int)estimate;
    }
}
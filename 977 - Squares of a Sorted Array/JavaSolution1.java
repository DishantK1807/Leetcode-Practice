class Solution {
    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++){
            A[i] = (int)Math.pow(A[i], 2);
        }
        Arrays.sort(A);
        return A;
    }
}
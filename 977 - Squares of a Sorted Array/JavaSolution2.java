class Solution {
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length - 1;
        int[] result = new int[end + 1];
        int index = end;

        while(start <= end){
            if (Math.abs(A[start]) > A[end]){
                result[index] = A[start] * A[start];
                start++;
            }
            else{
                result[index] = A[end] * A[end];
                end--;
            }

            index--;
        }

        return result;
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1_length = nums1.length - 1;

        for (int i = num1_length; i >= 0; i--){
            if (m > 0 && n > 0){
                if (nums1[m-1] > nums2[n-1]){
                    nums1[i] = nums1[m-1];
                    m--;
                }

                else{
                    nums1[i] = nums2[n-1];
                    n--;
                }
            }

            else{
                if (m > 0){
                    nums1[i] = nums1[m-1];
                    m--;
                }

                else{
                    nums1[i] = nums2[n-1];
                    n--;
                }
            }
        }
    }
}
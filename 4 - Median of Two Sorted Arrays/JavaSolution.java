class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int total = n1 + n2;
        float[] tot = new float[total];
        int middle = (int)(total / 2);
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < n1 && j < n2){
            if(nums1[i] <= nums2[j]){
                tot[k] = nums1[i];
                i++;
            }
            else{
                tot[k] = nums2[j];
                j++;
            }

            if (k == middle){
                if (total % 2 == 0){
                    return (float)((tot[middle] + tot[middle-1]) / 2);
                }
                else{
                    return (float)(tot[middle]);
                }
            }
            k++;
        }

        while(i < n1){
            tot[k] = nums1[i];
            i++;
            if (k == middle){
                if (total % 2 == 0){
                    return (float)((tot[middle] + tot[middle-1]) / 2);
                }
                else{
                    return (float)(tot[middle]);
                }
            }
            k++;
        }

        while(j < n2){
            tot[k] = nums2[j];
            j++;
            if (k == middle){
                if (total % 2 == 0){
                    return ((tot[middle] + tot[middle-1])/2);
                }
                else{
                    return (tot[middle]);
                }
            }
            k++;
        }

        return -1;
    }
}
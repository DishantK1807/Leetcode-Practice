class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        for (Integer n : nums1) n1.add(n);
        HashSet<Integer> n2 = new HashSet<>();
        for (Integer n : nums2) n2.add(n);

        n1.retainAll(n2);

        int[] result = new int[n1.size()];
        int index = 0;
        for(int ele: n1){
            result[index++] = ele;
        }

        return result;
    }
}
class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal_triangle = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> inner_list = new ArrayList<>();
            inner_list.add(1);
            for(int j = 1; j <= i; j++){
                int val = ((inner_list.get(j - 1) * (i - j + 1)) / j);
                inner_list.add(val);

            }

            pascal_triangle.add(inner_list);
        }

        return pascal_triangle;
    }
}
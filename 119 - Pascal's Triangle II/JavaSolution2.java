class Solution {
    public List<Integer> getRow(int rowIndex) {

        if (rowIndex < 0)
            return new ArrayList();

        List<Integer> pascal_row = new ArrayList<>();
        pascal_row.add(1);

        int top =  rowIndex;
        int bottom = 1;
        long val = 1;

        for(int i = 1; i <= rowIndex; i++){
            val *= top;
            val /= bottom;
            top--;
            bottom++;
            pascal_row.add((int)val);
        }

        return pascal_row;

    }
}
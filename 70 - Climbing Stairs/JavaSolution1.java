import java.util.HashMap;

class Solution {
    HashMap<Integer, Integer> stairs = new HashMap<>();
    public int climbStairs(int n) {

        if(stairs.containsKey(n))
            return stairs.get(n);

        int result;
        if(n<4)
            result = n;

        else{
            result = climbStairs(n-1) + climbStairs(n-2);
        }

        stairs.put(n, result);

        return result;
    }
}
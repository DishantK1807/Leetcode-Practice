class Solution {
    public boolean isValid(String s) {
        char[] char_arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int top = -1;
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        char stack_top = ' ';

        for(char c : char_arr){
            if (top == -1){
                stack.push(c);
                top++;
            }
            else{

                if(brackets.containsKey(c)){
                    stack_top = stack.peek();
                    if(stack_top == brackets.get(c)){
                        stack.pop();
                        top--;
                    }
                    else{
                        stack.push(c);
                        top++;
                    }
                }

                else{
                        stack.push(c);
                        top++;
                }

            }
        }

        if (stack.empty()){
            return true;
        }

        return false;
    }
}
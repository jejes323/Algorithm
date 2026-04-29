class Solution {
    public boolean isValid(String s) {
        boolean check = true;
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
            } else if(c == '[') {
                stack.push(']');
            } else if(c == '{') {
                stack.push('}');
            }
            else {
                if(stack.isEmpty() || stack.peek() != c) {
                    return false;
                } else if(stack.peek() == c) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? check : false;
    }
}
class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='[' || arr[i]=='{'){
                stack.push(arr[i]);
            }
            else{
                if(stack.isEmpty()) return false;
                else if(stack.peek()=='(' && arr[i]==')' || 
                        stack.peek()=='[' && arr[i]==']' || 
                        stack.peek()=='{' && arr[i]=='}')
                stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}
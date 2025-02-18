class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> st = new Stack<>();
    int res =0;

    for(int i = 0; i < operations.length ; i++){
        String str = operations[i];
        char chr = str.charAt(0);

        if(chr == 'D' ) st.push(2*st.peek());
        else if(chr == 'C') st.pop();
        else if(chr == '+'){
            int num1 = st.pop();
            int num2 = st.peek();
            st.push(num1);
            st.push(num1+num2);
        }
        else{
            int num = Integer.parseInt(str);
            st.push(num);
        }    
    }

    while(!st.isEmpty()){
    res+=st.pop();
    }

    return res;
    }
}
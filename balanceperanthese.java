import java.util.Stack;

class balanceperantheses{
    public static void main(String[] args) {
        String str ="{([])}";
        String str1 ="{([]})";

        boolean ans= isbalance(str);
        boolean ans1= isbalance(str1);
        System.out.println(ans);
        System.out.println(ans1);
    }

    public static boolean isbalance(String str) {
       
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')  {
             st.push(str.charAt(i));
           
        }else{
            if(!st.isEmpty() && ((st.peek() == '(' && str.charAt(i) == ')') ||
            (st.peek() == '{' && str.charAt(i) == '}') ||
            (st.peek() == '[' && str.charAt(i) == ']'))){
                st.pop();
            }else{
                return false;
            }
        }
       
    }
        return st.empty();
 }
}



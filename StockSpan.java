

import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        Stack<Integer> st= new Stack<>();
        int [] span= new int[prices.length];
        for(int i=0;i<prices.length;i++)
        {
            while(!st.isEmpty() && prices[st.peek()]<=prices[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                span[i]=i+1;
            }
            else
            {
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int[] spans = calculateSpan(prices);
        System.out.print("Stock spans: ");
        for (int span : spans) {
            System.out.print(span + " ");
        }
        // Output: Stock spans: 1 1 1 2 1 4 6
    }
}
 

import java.util.Stack;
import java.util.Arrays;

public class stackj {
   public static int[] nextGreaterElement(int[] arr) {
    Stack<Integer> st = new Stack<>();
    int n= arr.length-1;
    int result[]= new int[arr.length];
    for(int i=n;i>=0;i--)
    {
        while(!st.isEmpty() && st.peek()<=arr[i])
        {
          st.pop();
        }
        if(st.isEmpty())
        {
            result[i]=-1;
        }
        else{
            result[i]=st.peek();
        }
        st.push(arr[i]);
    }
    return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,10,15,8,9,11,3};
        int[] result = nextGreaterElement(arr);
        System.out.println(Arrays.toString(result));  // Output: [5, 10, 10, -1, -1]
    }
}

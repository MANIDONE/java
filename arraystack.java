class Stack {
    int []arr;
    int size;
    int top;
    Stack(int size)
    {
        arr=  new int[size];
        top=-1;
    }

  public void push(int data)
  {
    if(top==size-1)
    {
        System.out.print("stack is full");
        return;
    }

     top++;
     arr[top]=data;
  }
  public int pop()
  {
    if(top==-1)
    {
        System.out.print("there is stack is empty");
        return -1;    }

  int val= arr[top];
  top--;
  return val;
  }

 public int peek()
 {
    if(top==-1)
    {
        System.out.print("there is stack is empty");
        return -1;    }

  int val= arr[top];
  return val;
}
}

public class arraystack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek()); 
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
    }
}


package arraybasedstack;



/**
 *
 * @author zs0877310
 */
public class ArrayBasedStack  {
    public static void main(String[] args)
   {
       ArrayBasedStack stack = new ArrayBasedStack();
       stack.push(37);
       stack.push(58);
       stack.push(83);
       stack.push(92);
       stack.push(13);
       stack.pop(); 
       stack.push(11);
       stack.push(73);
       stack.push(32);
       stack.push(10);
       System.out.println(stack.peek() + " was peeked at from the stack");
       stack.peekAll();
      // System.out.println(stack.toString());
   }
    int size;
    int capacity;
    int [] stack;
    int topOfStack;
   
   public ArrayBasedStack()
   {
       size = 0;
       capacity = 25;
       topOfStack = -1;
       stack = new int[capacity];
   }
   public boolean isEmpty()
   {
       return topOfStack == -1;
   }
   public void makeEmpty()
   {
       topOfStack = -1;
       size = 0;
   }

   public int push(int data)
   {
       if(topOfStack >= capacity)
       {
           System.out.println("Stack Overflow error");
           return 0;
       }
       else
       {
           stack[++topOfStack] = data;
           size++;
           System.out.println(data + " was pushed to the stack");
           return data; 
           
       }

   }
   public int pop()
   {
       if(topOfStack < 0)
       {
           System.out.println("Stack Overflow error");
           return 0;
       }
       else
       {
           int data = stack[topOfStack--];
           size--;
           System.out.println(data + " was popped from the stack");
           return data;
           
       }
   }
   public int peek()
   {
       return stack[topOfStack];
   }
   public void peekAll()
   {
       System.out.print("{ " );
        for(int i = 0; i < size; i++)
        {
            System.out.print(""+ stack[i] + ", ");
        }
        System.out.println(" } The Last element is the Current Top of the Array Based Stack" );
   }


   
}    
    


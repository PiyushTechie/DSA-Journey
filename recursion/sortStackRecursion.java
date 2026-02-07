import java.util.*;
public class sortStackRecursion {
    public static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        sortStack(stack);
        insertSorted(stack, top);
    }

    public static void insertSorted(Stack<Integer> stack, int element){
        if(stack.isEmpty() || element > stack.peek()){
            stack.push(element);
            return;
        }

        int top = stack.peek();
        insertSorted(stack, element);
        stack.push(top);
    }
}

import java.util.*;

public class reverseStackUsingRecursion {
    public static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        insertBottom(stack, top);
    }

    public static void insertBottom(Stack<Integer> stack, int element){
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertBottom(stack, element);
        stack.push(top);
    }
}

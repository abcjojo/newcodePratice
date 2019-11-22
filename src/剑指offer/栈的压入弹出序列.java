package 剑指offer;

import java.util.Stack;

public class 栈的压入弹出序列 {

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA.length == 0 || popA.length == 0)
            return false;

        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;

        for (int i=0; i<pushA.length; i++){
            stack.push(pushA[i]);

            if (!stack.isEmpty() && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }
}

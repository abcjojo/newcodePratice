package 剑指offer;

import org.junit.Test;

import java.util.Stack;

public class TestArray {
    @Test
    public void test(){
        int pushA[] = {1,2,3,4,5};
        int popA[] = {4,5,3,2,1};

        System.out.println(IsPopOrder(pushA,popA));
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if (pushA.length == 0 || popA.length == 0)
            return false;

        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;

        for (int i=0; i<pushA.length; i++){
            stack.push(pushA[i]);

            while (!stack.isEmpty() && stack.peek() == popA[popIndex]){
                stack.pop();
                popIndex++;
            }
        }

        return stack.isEmpty();
    }

}

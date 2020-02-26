package 剑指offer.牛客剑指offer编程题;

import org.junit.Test;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-11 19:25
 **/
public class 数组奇数在前偶数在后 {
    public void reOrderArray(int [] array) {
        if (array.length == 0)return;
        int index;
        if (array[0]%2==0) index = 0;
        else index = 1;

        for(int i=1; i<array.length; i++){
            if (array[i]%2 != 0){
                move(array,index,i);
                index++;
            }
        }
    }
    private void move(int [] array, int start, int end){
        if (end < start) return ;
        int tmp = array[end];
        for(int i=end; i>start; i--){
            array[i] = array[i-1];
        }
        array[start] = tmp;
    }
    @Test
    public void test(){
        int [] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        for (int c:array){
            System.out.print(c+ "  ");
        }
    }
}

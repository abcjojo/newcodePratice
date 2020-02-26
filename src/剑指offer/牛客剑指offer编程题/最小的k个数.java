package 剑指offer.牛客剑指offer编程题;

import java.util.ArrayList;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-09-13 10:23
 **/
public class 最小的k个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>(k);
        if (input.length < k) return null;
        for (int i = 0; i < k; i++){
            list.add(input[i]);
        }

        return list;
    }

    public static void main(String[] args) {
        String str = "asdf";
        char a=str.charAt(3);
        System.out.println(a);
    }
}

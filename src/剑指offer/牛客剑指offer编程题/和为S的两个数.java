package 剑指offer.牛客剑指offer编程题;

import java.util.ArrayList;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-14 17:27
 **/
public class 和为S的两个数 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0, right = array.length-1;

        while (left < right) {
            if (array[left] + array[right] == sum) {
                list.add(array[left]);
                list.add(array[right]);
                return list;
            }
            else if (array[left] + array[right] > sum)
                right--;
            else
                left++;
        }
        return list;
    }
}

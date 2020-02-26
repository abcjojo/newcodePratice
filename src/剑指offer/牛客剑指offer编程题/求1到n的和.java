package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-14 17:52
 **/
public class 求1到n的和 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean flag = (sum>0) && ((sum+=Sum_Solution(sum-1))>0);
        return sum;
    }
}

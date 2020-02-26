package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-09-27 10:21
 **/
public class 数组中的逆序数对 {
    public static  int InversePairs(int [] array) {
        int result = 0;
        for (int i=0; i<array.length-1; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]>array[j]){
                    result++;
                }
            }
        }
        result = result%1000000007;
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(array));
    }
}

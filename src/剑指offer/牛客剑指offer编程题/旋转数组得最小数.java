package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 10:01
 **/
public class 旋转数组得最小数 {
    public int minNumberInRotateArray(int [] array) {
        if (array.length==0) return 0;
        int i=0;
        while (array[i]<=array[i+1]){
            i++;
        }
//        resver(array,0,i);
//        resver(array,i+1, array.length-1);
//        resver(array,0,array.length);

        //直接找到并返回数组中的最小数即可，无需反转数组讲数组，变成非递减数组再求出最小值
        return array[i+1];
    }
//    public void resver(int[] array, int start, int end){
//        while(start<end){
//            int temp = array[start];
//            array[start] = array[end];
//            array[end] = temp;
//            start++;
//            end--;
//        }
//    }
}

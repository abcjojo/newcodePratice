package 剑指offer.牛客剑指offer编程题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-25 11:25
 **/
public class 数组中只出现一次的数 {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Map<Integer,Integer> map = new HashMap();
        //将数组元素存进hashmap中
        for (int i = 0; i < array.length; i++){
            //检测key是否已经出现过
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        int count = 0;
        //找到只出现过一次的元素
        Iterator iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            if ((int)entry.getValue()==1 && count==0){
                num1[0] = (int)entry.getKey();
                count++;
            }
            if((int)entry.getValue()==1 && count==1){
                num2[0] = (int)entry.getKey();
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[]  num0 = new int[1];
        int[]  num1 = new int[1];

        数组中只出现一次的数 arr  = new 数组中只出现一次的数();
        arr.FindNumsAppearOnce(array,num0,num1);
        System.out.println(num0[0]);
        System.out.println(num1[0]);
    }
}










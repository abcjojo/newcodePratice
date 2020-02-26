package 剑指offer.牛客剑指offer编程题;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-25 21:15
 **/
public class 数组中出现次数超过数组长度一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map = new HashMap<>();
        //将数组中的元素存进map中 若已存在，则value+1
        for (int i = 0; i < array.length; i++){
            if (map.containsKey(array[i])) {
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i],1);
            }
        }
        int leng = array.length/2;;
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            if((int)entry.getValue()>leng){
                return (int)entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int [] array = {1,2,3,2,2,2,5,4,2};
        数组中出现次数超过数组长度一半的数字 test = new 数组中出现次数超过数组长度一半的数字();

        System.out.println(test.MoreThanHalfNum_Solution(array));

    }
}

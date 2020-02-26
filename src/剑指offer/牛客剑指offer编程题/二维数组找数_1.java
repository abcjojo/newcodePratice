package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 09:43
 **/
public class 二维数组找数_1 {
    public boolean Find(int target, int [][] array) {
        int row = array.length-1;
        int col = 0;
        while(row>=0 && col<array[0].length){
            if (target==array[row][col]) return true;
            else if (target<array[row][col]) row--;
            else col++;
        }
        return false;
    }
}

package 剑指offer;

public class 数组中的重复数字 {

    public boolean duplicate(int numbers[],int length,int [] duplication) {

        boolean [] flag = new boolean[length];
        for (int i = 0; i < flag.length; i++){

            if (flag[numbers[i]] == true){
                duplication[0] = numbers[i];

                return true;
            }

            flag [numbers[i]] = true;
        }

        return false;
    }
}

package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-22 16:01
 **/
public class 不用加减乘除做两数之和 {
    public int Add(int num1,int num2) {
        int num3;
        int num4;
        do{
            num1=num1^num2;
            num2=(num1&num2)<<1;

        }while(num2!=0);
        return (num1|num2);


    }
    public static void main(String[] args){
        System.out.println(new 不用加减乘除做两数之和().Add(3,4));

    }
}

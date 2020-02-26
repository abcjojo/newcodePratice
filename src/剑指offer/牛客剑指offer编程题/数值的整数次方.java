package 剑指offer.牛客剑指offer编程题;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-08-21 20:35
 **/
public class 数值的整数次方 {
    public static void main(String[] args) {
        System.out.println(Power(3,5));;
    }
    public  static double Power(double base, int exponent) {
        double result=1,cur=base;
        int n;
        if(exponent>0) n=exponent;
        else if(exponent<0){
            if (base==0) throw new RuntimeException("timeoput");
            n=-exponent;
        }
        else return 1;

        while (n!=0){
            if ((n&1)==1){
                result*=cur;
            }
            cur*=cur;
            n>>=1;
        }
        return exponent>0?result:(1/result);
    }





    public  static double Power1(double base, int n) {
        double res = 1,curr = base;
        int exponent;
        if(n>0){
            exponent = n;
        }else if(n<0){
            if(base==0)
                throw new RuntimeException("分母不能为0");
            exponent = -n;
        }else{// n==0
            return 1;// 0的0次方
        }
        while(exponent!=0){
            if((exponent&1)==1)
                res*=curr;
            curr*=curr;// 翻倍
            exponent>>=1;// 右移一位
        }
        return n>=0?res:(1/res);
    }
}

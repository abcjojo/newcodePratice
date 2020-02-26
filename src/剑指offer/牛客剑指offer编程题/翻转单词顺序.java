package 剑指offer.牛客剑指offer编程题;

import org.junit.Test;

/**
 * @program: exercise
 * @description:
 * @author: Jojo.Lee
 * @create: 2019-10-14 19:51
 **/
public class 翻转单词顺序 {
    public String ReverseSentence(String str) {
        char[] s = str.toCharArray();
        reverse(s,0,s.length-1);
        int index = 0;
        for (int i = 0; i<s.length-1; i++){
            if (s[i] == ' '){
                reverse(s,index,i-1);
                index = i+1;
            }

        }
        reverse(s,index,s.length-1);
        return new String(s);
    }
    public void reverse(char[] chars,int start, int end){
        while (start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
    }
    @Test
    public void test(){
        String s = "hello world!";

        System.out.println(ReverseSentence(s));
    }
}

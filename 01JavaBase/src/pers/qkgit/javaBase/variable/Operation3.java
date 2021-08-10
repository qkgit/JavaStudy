package pers.qkgit.javaBase.variable;

/**
 * @Author Qi
 * @data 2021/8/10 14:46
 */
public class Operation3 {
    public static void main(String[] args) {
        //1.编码情况1：
        long l = 123213;
        System.out.println(l);
        //编译失败：过大的整数
        //long l1 = 21332423235234123;
        long l1 = 21332423235234123L;
        double d1 = 12.3;
        //编译失败
        //float f1 = 12.3;
        float f1 = (float)12.3;
        float f2 = 3.14F;
        //****************
        
        //2.编码情况2：
        //整型常量，默认类型为int型
        //浮点型常量，默认类型为double型
        byte b = 12;
        //byte b1 = b + 1;//编译失败
        //float f1 = b + 12.3;//编译失败
    }
}

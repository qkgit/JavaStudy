package flowControl;

import org.junit.Test;

import java.util.Scanner;

/**
 * @Auther Qi
 * @data 2021/9/6 16:51
 */
public class ForTest {

    /**
     * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
     * 比如：12和20的最大公约数是4，最小公倍数是60。
     *
     * 说明：break关键字的使用：一旦在循环中执行到break，就跳出循环
     */
    @Test
    public void forTest(){
        Scanner num = new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int m = num.nextInt();
        System.out.println("请输入第二个正整数：");
        int n = num.nextInt();

        //获取最大公约数
        //1.获取两个数中的较小值
        int min = (m <= n)? m : n;
        //2.遍历
        for(int i = min;i >= 1 ;i--){
            if(m % i == 0 && n % i == 0){
                System.out.println("最大公约数为：" + i);
                break;//一旦在循环中执行到break，就跳出循环
            }
        }

        //获取最小公倍数
        //1.获取两个数中的较大值
        int max = (m >= n)? m : n;
        //2.遍历
        for(int i = max;i <= m * n;i++){
            if(i % m == 0 && i % n == 0){
                System.out.println("最小公倍数：" + i);
                break;

            }
        }
    }

    /**
     * 题目：
     * 从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
     *
     * 说明：
     * 1. 不在循环条件部分限制次数的结构：for(;;) 或 while(true)
     * 2. 结束循环有几种方式？
     *      方式一：循环条件部分返回false
     * 	 方式二：在循环体中，执行break
     */
    @Test
    public void ForWhileTest(){
        Scanner scan = new Scanner(System.in);

        int positiveNumber = 0;//记录正数的个数
        int negativeNumber = 0;//记录负数的个数

        for(;;){//while(true){

            int number = scan.nextInt();

            //判断number的正负情况
            if(number > 0){
                positiveNumber++;
            }else if(number < 0){
                negativeNumber++;
            }else{
                //一旦执行break，跳出循环
                break;
            }

        }

        System.out.println("输入的正数个数为：" + positiveNumber);
        System.out.println("输入的负数个数为：" + negativeNumber);
    }

    /**
     * 九九乘法表
     */
    @Test
    public void NineNineTable(){
        for(int i = 1;i <= 9;i++){

            for(int j = 1;j <= i;j++){
                System.out.print(i + " * " + j + " = " + (i * j) + "  ");
            }

            System.out.println();
        }
    }

    /**
     *  100以内的所有质数的输出。
     * 质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。
     *
     * 最小的质数是：2
     */
    @Test
    public void PrimeNumber(){
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值

        for(int i = 2;i <= 100;i++){//遍历100以内的自然数
            for(int j = 2;j < i;j++){//j:被i去除
                if(i % j == 0){ //i被j除尽
                    isFlag = false;
                }
            }
            //
            if(isFlag == true){
                System.out.println(i);
            }
            //重置isFlag
            isFlag = true;
        }
    }

    /**
     * 100000以内的所有质数的输出。实现方式一
     * 质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。
     *
     * 对PrimeNumber()方法中质数输出问题的优化
     */
    @Test
    public void PrimeNumber1(){
        boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值
        int count = 0;//记录质数的个数

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();

        for(int i = 2;i <= 100000;i++){//遍历100000以内的自然数
            //优化二：对本身是质数的自然数是有效的。
            //for(int j = 2;j < i;j++){
            for(int j = 2;j <= Math.sqrt(i);j++){//j:被i去除
                if(i % j == 0){ //i被j除尽
                    isFlag = false;
                    break;//优化一：只对本身非质数的自然数是有效的。
                }

            }
            //
            if(isFlag == true){
                //System.out.println(i);
                count++;
            }
            //重置isFlag
            isFlag = true;

        }

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start));//17110 - 优化一：break:1546 - 优化二：13
    }

    /**
     * 100000以内的所有质数的输出。实现方式二
     * 质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。
     *
     * 对PrimeNumberTest.java文件中质数输出问题的优化
     */
    @Test
    public void PrimeNumber2(){
        int count = 0;//记录质数的个数
        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long start = System.currentTimeMillis();

        label:for(int i = 2;i <= 100000;i++){//遍历100000以内的自然数
            for(int j = 2;j <= Math.sqrt(i);j++){//j:被i去除
                if(i % j == 0){ //i被j除尽
                    continue label;
                }
            }
            //能执行到此步骤的，都是质数
            count++;
        }

        //获取当前时间距离1970-01-01 00:00:00 的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花费的时间为：" + (end - start));//17110 - 优化一：break:1546 - 优化二：13
    }
}

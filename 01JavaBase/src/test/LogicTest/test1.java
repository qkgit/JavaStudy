package LogicTest;

import org.junit.Test;

/**
 * @Auther Qi
 * @data 2021/8/31 16:43
 */
public class test1 {
    @Test
    public void test(){
        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方式一：定义临时变量的方式
        //推荐的方式
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //方式二：好处：不用定义临时变量
        //弊端：① 相加操作可能超出存储范围 ② 有局限性：只能适用于数值类型
        //num1 = num1 + num2;
        //num2 = num1 - num2;
        //num1 = num1 - num2;

        //方式三：使用位运算符
        //有局限性：只能适用于数值类型
        //num1 = num1 ^ num2;
        //num2 = num1 ^ num2;
        //num1 = num1 ^ num2;

        System.out.println("num1 = " + num1 + ",num2 = " + num2);
    }
}

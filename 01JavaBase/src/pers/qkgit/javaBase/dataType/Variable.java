package pers.qkgit.javaBase.dataType;

/**
 * @Author Qi
 * @data 2021/7/20 16:18
 */

/**
 *  变量 Variable  是程序中最基本的存储单元。包含变量类型、变量名和存储的值
 *  按数据类型分类
 *      基本数据类型
 *          数值型
 *              整型   ： byte(1字节) 、short(2字节) 、int(4字节) 、long（8字节）
 *              浮点型 ： float 、double
 *          字符型  ： char
 *          布尔型  ：boolean
 *      引用数据类型
 *          类   ： class
 *          接口 ： interface
 *          数组 ： []
*/
public class Variable {
    public static void main(String[] args) {
        byte var1 = 12;
        byte var2 = -128;
        System.out.println(var1);
        System.out.println(var2);
        boolean var3 = true;
        boolean var4 = true;
        long var5 = 3414234324L;
        System.out.println(var5);
        double var7 = 123.3D;
        System.out.println(var7 + 1.0D);
        float var9 = 12.3F;
        System.out.println(var9);
        char var10 = 'a';
        System.out.println(var10);
        char var11 = '1';
        char var12 = 20013;
        char var13 = 12473;
        System.out.println(var11);
        System.out.println(var12);
        System.out.println(var13);
        boolean var14 = true;
        char var18 = '\t';
        System.out.print("hello" + var18);
        System.out.println("world");
        char var15 = 'C';
        System.out.println(var15);
        boolean var16 = true;
        System.out.println(var16);
        boolean var17 = true;
        if (var17) {
            System.out.println("你就不能参加\"单身\"party了！\\n很遗憾");
        } else {
            System.out.println("你可以多谈谈女朋友！");
        }

    }



}



//class VariableTest {}//逆向思维，反证法


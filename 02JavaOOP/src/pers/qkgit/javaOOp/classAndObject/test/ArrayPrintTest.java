package pers.qkgit.javaOOp.classAndObject.test;

/**
 * @Auther Qi
 * @data 2021/9/10 16:29
 */
public class ArrayPrintTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr);//地址值

        char[] arr1 = new char[]{'a','b','c'};

        System.out.println(arr1); //abc  print输出char[] 本质是遍历数组的值
        System.out.println(arr1+""); //[C@677327b6
        // char + "" 被强转为 string类型 所以输出为地址值
    }
}

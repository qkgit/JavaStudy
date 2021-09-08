package pers.qkgit.javaBase.array.test;

/**
 * @Auther Qi
 * @data 2021/9/8 10:36
 *  * ⑤ 数组元素的默认初始化值
 *  * 		> 数组元素是整型：0
 *  * 		> 数组元素是浮点型：0.0
 *  * 		> 数组元素是char型：0或'\u0000'，而非'0'
 *  * 		> 数组元素是boolean型：false
 *  *
 *  * 		> 数组元素是引用数据类型：null
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //5.数组元素的默认初始化值
        System.out.println("*****int*****");
        int[] arr = new int[4];
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("*****short*****");
        short[] arr1 = new short[4];
        for(int i = 0;i < arr1.length;i++){
            System.out.println(arr1[i]);
        }

        System.out.println("*****float*****");
        float[] arr2 = new float[5];
        for(int i = 0;i < arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("*****char*****");
        char[] arr3 = new char[4];
        for(int i = 0;i < arr3.length;i++){
            System.out.println("----" + arr3[i] + "****");
        }
        if(arr3[0] == 0){
            System.out.println("默认值为0");
        }
        if (arr3[0] == '0'){
            System.out.println("默认值为 '0' ");
        }

        System.out.println("*****boolean*****");
        boolean[] arr4 = new boolean[5];
        System.out.println(arr4[0]);

        System.out.println("*****String（引用数据类型）*****");
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);
        if(arr5[0] == null){
            System.out.println("北京天气不错！");
        }
    }
}

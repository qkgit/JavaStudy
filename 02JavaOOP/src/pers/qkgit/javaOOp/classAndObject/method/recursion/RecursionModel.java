package pers.qkgit.javaOOp.classAndObject.method.recursion;

/**
 * @Author Qi
 * @data 2021/7/26 14:19
 *
 * 递归方法：一个方法体内调用它自身。
 */
public class RecursionModel {

    public static void main(String[] args) {

        int n = 100;
        int m = 10;

        // 1.计算1-n之间所有自然数的和
        // 方式一：
        int sum = 0;
        for (int i = 1;i<=n;i++){
            sum +=i;
        }
        System.out.println("sum(100)="+sum);
        // 方式二：
        RecursionModel test = new RecursionModel();
        int sum1 = test.getSum(n);
        System.out.println("sum(100)="+sum1);

        // 2.计算n!
        int product = test.getProduct(n);
        System.out.println("100!="+product);

        //3.已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
        //	其中n是大于0的整数，求f(10)的值。
        int f = test.f(10);
        System.out.println("f(10)="+f);

        //4.斐波那契数列
        String s ="";
        for (int i=1;i<=m;i++){
            s += test.getFib(i)+" ";
        }
        System.out.print("斐波那契数列前"+m+"项为："+s);

        // 汉诺塔 f(n) =  2*f(n-1)+1   1:1  2:3  3:7  ...

        // 快排


    }

    // 1.求和
    public int getSum(int n){
        if (n == 1){
            return 1;
        }else {
            return n + getSum(n-1);
        }
    }
    // 2.求积 n!
    public int getProduct(int n){
        if (n == 1){
            return 1;
        }else {
            return n * getSum(n-1);
        }
    }
    // 3.
    public int f(int n ){
        if (n==0){
            return 1;
        }else if (n==1){
            return 4;
        }else {
            return 2*f(n-1)+f(n-2);
        }
    }
    // 4.斐波那契数列
    public int getFib(int n){
        if (n==1){
            return 1;
        }else if (n==2){
            return 1;
        }else {
            return getFib(n-1)+getFib(n-2);
        }
    }


}

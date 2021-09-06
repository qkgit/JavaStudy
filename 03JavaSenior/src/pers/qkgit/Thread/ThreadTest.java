package pers.qkgit.Thread;

/**
 * @Auther Qi
 * @data 2021/8/16 13:46
 */

import pers.qkgit.Thread.model.MyThread;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有的偶数
 *
 * @author shkstart
 * @create 2019-02-13 上午 11:46
 */
public class ThreadTest {
    public static void main(String[] args) {
        // 3. 创建Thread类的子类的对象
        MyThread myThread = new MyThread();
        // 4. 通过此对象调用start()
        myThread.start();
    }
}

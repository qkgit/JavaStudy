package pers.qkgit.Thread.model;

/**
 * @Auther Qi
 * @data 2021/8/16 13:48
 */
//1. 创建一个继承于Thread类的子类
public class MyThread extends Thread {
    //2. 重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

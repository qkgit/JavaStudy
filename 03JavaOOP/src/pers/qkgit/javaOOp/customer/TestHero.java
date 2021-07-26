package pers.qkgit.javaOOp.customer;

/**
 * @Author Qi
 * @data 2021/7/26 17:26
 *
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 * construct：建设、建造。  construction:CCB    constructor:建设者
 * 一、构造器的作用：
 * 1.创建对象
 * 2.初始化对象的信息
 *
 * 属性赋值的先后顺序
 * ① 默认初始化
 * ② 显式初始化
 * ③ 构造器中初始化
 * **********************
 * ④ 通过"对象.方法" 或 "对象.属性"的方式，赋值
 */
public class TestHero {
    public static void main(String[] args) {
        System.out.println("**********************(id显式初始化，其他默认初始化)");
        Hero garen = new Hero();
        System.out.println(garen.toString());
        garen.duiXian();
        System.out.println("**********************(构造器初始化)");
        Hero teemo = new Hero("提莫");
        System.out.println(teemo.getName());
        System.out.println("**********************");
        Hero vn = new Hero("VN", 6300);
        System.out.println(vn.getName()+"的价格是"+vn.getPrice());
        System.out.println("**********************(调用方法 赋值)");
        Hero ez = new Hero();
        System.out.println(ez.toString());
        ez.setPrice(6300);
        System.out.println(ez.toString());

    }
}

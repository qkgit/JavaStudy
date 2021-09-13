package pers.qkgit.javaOOp.classAndObject.model;

/**
 * @Author Qi
 * @data 2021/7/26 17:26

 *

 */
public class HeroConstructor {
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

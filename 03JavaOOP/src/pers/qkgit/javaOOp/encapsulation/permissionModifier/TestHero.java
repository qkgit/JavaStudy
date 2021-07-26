package pers.qkgit.javaOOp.encapsulation.permissionModifier;

/**
 * @Author Qi
 * @data 2021/7/26 17:04
 *
 * 三、封装性的体现，需要权限修饰符来配合。
 * 1.Java规定的4种权限（从小到大排列）：private(类内部)、缺省(同一个包)、protected(不同包的子类) 、public(同一个工程)
 * 2.4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3.具体的，4种权限都可以用来修饰类的内部结构：属性、方法、构造器、内部类
 *        修饰类的话，只能使用：缺省、public
 *
 * 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小。
 */
public class TestHero {
    public static void main(String[] args) {
        Hero garen = new Hero();

        /**
         * 属性
         */
        garen.name = "盖伦";   // 缺省的
        garen.attack = 500;   // public
//        garen.hp = 5000;    // private 出了Hero类  私有结构就不能使用

        /**
         * 方法
         */
        garen.publicMethod();
        garen.defaultMethod();
//        garen.privateMethod();   // private 出了Hero类  私有结构就不能使用

    }
}

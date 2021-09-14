package pers.qkgit.javaOOp.encapsulation.permissionModifier;

import pers.qkgit.javaOOp.encapsulation.model.Hero;
import pers.qkgit.javaOOp.encapsulation.model.HeroPermission;

/**
 * @Author Qi
 * @data 2021/7/26 15:17
 */
public class PermissionTest {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        System.out.println(garen.toString());

        garen.setArmor(83.4);
        System.out.println(garen.toString());

        garen.setHp(-100);
        System.out.println(garen.toString());

        /**
         *  缺省权限修饰符
         */
        HeroPermission teemo = new HeroPermission();
        /**
         * 属性
         */
//        teemo.name = "盖伦"; // 缺省的  私有的结构、缺省声明的结构就不可以调用了
        teemo.attack = 500;   // public
//        teemo.hp = 5000;    // private 出了Hero类  私有结构就不能使用

        /**
         * 方法
         */
        teemo.publicMethod();
//        teemo.defaultMethod();   // 缺省的  私有的结构、缺省声明的结构就不可以调用了
//        teemo.privateMethod();   // private 出了Hero类  私有结构就不能使用

    }
}

package pers.qkgit.javaOOp.encapsulation.model;

import pers.qkgit.javaOOp.encapsulation.model.HeroPermission;

/**
 * @Author Qi
 * @data 2021/7/26 17:04
 */
public class PermissionTest {
    public static void main(String[] args) {
        HeroPermission garen = new HeroPermission();

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

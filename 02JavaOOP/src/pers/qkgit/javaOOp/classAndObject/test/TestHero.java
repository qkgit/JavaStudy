package pers.qkgit.javaOOp.classAndObject.test;

import pers.qkgit.javaOOp.classAndObject.model.Hero;

/**
 * @Author Qi
 * @data 2021/7/21 14:44
 */
public class TestHero {
    public static void main(String[] args) {
        /**
         * 2. 创建 Hero 类的对象
         */
        Hero garen = new Hero();
        Hero teemo =  new Hero();
        /**
         * 2.属性
         * 调用对象的结构：属性、方法
         * 调用属性：“对象.属性”
         */
        garen.name = "盖伦";
        garen.hp = 857.0F;
        garen.armor = 34.3F;
        garen.moveSpeed = 297;

        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        System.out.println(garen.toString());
        System.out.println(teemo.toString());

        /**
         * 3.方法
         * 调用方法：“对象.方法”
         */
        garen.legendary();
        teemo.keng();
        float garenHp = garen.getHp();
        System.out.println("盖伦当前血量"+garenHp);
        garen.recovery(123.00f);
        garenHp = garen.getHp();
        System.out.println("盖伦当前血量"+garenHp);

        //将 gren 变量保存的对象地址值赋给p3, 导致p1和p3指向了堆空间中的同一个对象实体。
        Hero amumu = garen;
        System.out.println(amumu.name);//"盖伦"

        amumu.hp = 100F;
        System.out.println(garen.hp);//10

    }

}


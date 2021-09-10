package pers.qkgit.javaOOp.classAndObject.model;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Auther Qi
 * @data 2021/9/10 15:40
 * 匿名对象使用
 */
public class HeroAnony {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.armor = 83;
        garen.hp= 857.0F;
        System.out.println(garen);
        garen.getHp();

        System.out.println("**********匿名对象**********");
        // 匿名对象
        new Hero().name = "提莫";
        new Hero().getHp(); // 0.0
        // 查看英雄面板匿名对象
        new Panel().show(garen);
    }
}
// 英雄面板
class Panel{
    void show(Hero hero){
        hero.getName();
        hero.getArmor();
        hero.getHp();
    }
}
package pers.qkgit.javaOOp.classAndObject.test;

import pers.qkgit.javaOOp.classAndObject.method.overLoading.HeroOL;

/**
 * @Author Qi
 * @data 2021/7/23 23:23
 */
public class TestHeroOL {
    public static void main(String[] args) {
        HeroOL garen = new HeroOL();
        garen.attack = 48;
        double sumAttack = garen.getSumAttack(45,25, 0, 20, 0, 25);
        System.out.println(sumAttack);
    }
}

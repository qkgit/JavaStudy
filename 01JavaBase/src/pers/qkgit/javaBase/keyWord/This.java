package pers.qkgit.javaBase.keyWord;

import pers.qkgit.javaBase.keyWord.model.Hero;

/**
 * @Auther Qi
 * @data 2021/9/15 14:53
 */
public class This {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("garen");
        System.out.println(hero.getName());

        hero.kill();
        System.out.println("_____________________");
        Hero teemo = new Hero("teemo", 18);
        System.out.println(teemo.getAge());
    }
}

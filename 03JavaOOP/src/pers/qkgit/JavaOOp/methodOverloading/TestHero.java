package pers.qkgit.JavaOOp.methodOverloading;

/**
 * @Author Qi
 * @data 2021/7/23 23:23
 */
public class TestHero {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.attack = 48;
        double sumAttack = garen.getSumAttack(45,25, 0, 20, 0, 25);
        System.out.println(sumAttack);
    }
}

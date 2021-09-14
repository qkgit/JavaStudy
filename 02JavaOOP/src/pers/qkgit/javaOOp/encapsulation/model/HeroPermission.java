package pers.qkgit.javaOOp.encapsulation.model;

/**
 * @Author Qi
 * @data 2021/7/26 16:59
 */
public class HeroPermission {

    String name;            // 名称
    private double hp;      // 血量
    public double attack;   // 攻击力

    private void privateMethod(){
        name = "Private";
        hp = 1000;
        attack = 100;
    }

    void defaultMethod(){
        name = "Default";
        hp = 2000;
        attack = 200;
    }

    public void publicMethod(){
        name = "Public";
        hp = 3000;
        attack = 300;
    }
}

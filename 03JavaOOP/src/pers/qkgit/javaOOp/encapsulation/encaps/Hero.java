package pers.qkgit.javaOOp.encapsulation.encaps;

/**
 * @Author Qi
 * @data 2021/7/26 15:11
 */
public class Hero {

    String name;        // 名称
    private double hp;          // 血量
    private double attack;      // 攻击力
    private double power;       // 法强
    private double resistance;  // 魔抗
    private double armor;       // 护甲



    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        if (hp>0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }

    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", power=" + power +
                ", resistance=" + resistance +
                ", armor=" + armor +
                '}';
    }
}

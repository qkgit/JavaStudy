package pers.qkgit.javaOOp.extendsClass.model;

/**
 * @Auther Qi
 * @data 2021/9/18 16:46
 */
public class ADC extends Hero{
    public float atk; // 攻击力
    public float crit; // 暴击率 0-100%
    public float critAtk; // 暴击伤害
    public int ranged; // 攻击距离


    //
    public void physicAttack() {
        System.out.println(this.name+"进行物理攻击");
    }


    public ADC() {
    }

    public float getAtk() {
        return atk;
    }

    public void setAtk(float atk) {
        this.atk = atk;
    }

    public float getCrit() {
        return crit;
    }

    public void setCrit(float crit) {
        this.crit = crit;
    }

    public float getCritAtk() {
        return critAtk;
    }

    public void setCritAtk(float critAtk) {
        this.critAtk = critAtk;
    }
}

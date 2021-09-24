package pers.qkgit.javaOOp.extendsClass.model;

/**
 * @Auther Qi
 * @data 2021/9/18 16:40
 */
public class Hero {
    public String name;   // 姓名
    public float hp;      // 当前血量
    public float maxHP;   // 最大生命值
    public float armor;   // 护甲
    public int moveSpeed; // 移动速度


    //坑队友
    public void keng(){
        System.out.println(name+"坑队友！");
    }
    // 击杀
    public void kill(Hero hero){
        System.out.println(this.name+"击杀了"+hero.name);
        recovery();
    }
    // 超神
    public void legendary(){
        System.out.println(name+"超神！");
    }
    // 凯旋回血我不死
    public void recovery(){
        this.hp += 0.05 * this.maxHP;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(float maxHP) {
        this.maxHP = maxHP;
    }

    public float getArmor() {
        return armor;
    }

    public void setArmor(float armor) {
        this.armor = armor;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}

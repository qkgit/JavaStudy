package pers.qkgit.javaOOp.classAndObject.testHero;

/**
 * @Author Qi
 * @data 2021/7/21 17:28
 */
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度


    /**
     *方法的声明：
     *     权限修饰符(默认public)  返回值类型(无返回值viod)  方法名(形参列表){
     *         方法体
     *  	   return (返回值);
     *      }
     */
    //获取护甲值
    float getArmor(){
        return armor;
    }
    //坑队友
    void keng(){
        System.out.println(name+"坑队友！");
    }
    // 超神
    void legendary(){
        System.out.println(name+"超神！");
    }
    // 获取当前血量
    float getHp(){
        return this.hp;
    }
    // 回复
    void recovery(float blood){
        this.hp += blood;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }
}

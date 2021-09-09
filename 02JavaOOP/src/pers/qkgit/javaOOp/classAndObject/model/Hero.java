package pers.qkgit.javaOOp.classAndObject.model;

/**
 * @Author Qi
 * @data 2021/7/21 17:28
 */
//1.创建类，设计类的成员
public class Hero {
    public String name; //姓名
    public float hp; //血量
    public float armor; //护甲
    public int moveSpeed; //移动速度


    /**
     *方法的声明：
     *     权限修饰符(默认public)  返回值类型(无返回值viod)  方法名(形参列表){
     *         方法体
     *  	   return (返回值);
     *      }
     */
    //获取护甲值
    public float getArmor(){
        return armor;
    }
    //坑队友
    public void keng(){
        System.out.println(name+"坑队友！");
    }
    // 超神
    public void legendary(){
        System.out.println(name+"超神！");
    }
    // 获取当前血量
    public float getHp(){
        return this.hp;
    }
    // 回复
    public void recovery(float blood){
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

package pers.qkgit.javaOOp.classAndObject.model;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @Author Qi
 * @data 2021/7/21 17:28
 */
//1.创建类，设计类的成员
public class Hero {
    public String name; //姓名
    public float hp; //当前血量
    public float maxHP; // 最大生命值
    public float armor; //护甲
    public int moveSpeed; //移动速度


    /**
     *方法的声明：
     *     权限修饰符(默认public)  返回值类型(无返回值viod)  方法名(形参列表){
     *         方法体
     *  	   return (返回值);
     *      }
     */
    // 获取姓名
    public String getName(){
        System.out.println("获取姓名"+this.name);
        return this.name;
    }
    //获取护甲值
    public float getArmor(){
        System.out.println("获取护甲");
        return armor;
    }
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
    // 获取当前血量
    public float getHp(){
        System.out.println(this.hp);
        return this.hp;
    }
    // 获取最大生命值
    public float getMaxHP(){
        return this.maxHP;
    }
    // 生命回复
    public void recovery(float blood){
        System.out.println("正在回复血量。。。");
        this.hp += blood;
    }
    // 凯旋回血我不死
    public void recovery(){
        this.hp += 0.05 * this.maxHP;
    }



    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", maxHP=" + maxHP +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }
}

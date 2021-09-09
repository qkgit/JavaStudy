package pers.qkgit.javaOOp.classAndObject.model;

/**
 * @Auther Qi
 * @data 2021/9/9 15:41
 */
public class HeroMethod {
    public String name; //姓名
    public float hp; //当前血量
    public float maxHP; // 最大生命值
    public float armor; //护甲
    public int moveSpeed; //移动速度

    /**
     *方法的声明：
     *     权限修饰符(默认 public)  返回值类型(无返回值 viod)  方法名(形参列表){
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
        return;
        //return后不可以声明表达式
//		System.out.println("KDA: 0/20/0");
    }
    // 超神
    public void legendary(){
        System.out.println(name+"超神！");
        recovery();
    }
    // 获取当前血量
    public float getHp(){
        return this.hp;
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
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                '}';
    }

}

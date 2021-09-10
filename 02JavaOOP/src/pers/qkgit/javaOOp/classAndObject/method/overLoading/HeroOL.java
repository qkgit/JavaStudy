package pers.qkgit.javaOOp.classAndObject.method.overLoading;

/**
 * @Author Qi
 * @data 2021/7/23 22:59
 */
public class HeroOL {
    String name; //姓名
    public double attack;//攻击力
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度



    float getHp(){
        return this.hp;
    }

    /**
     *  方法的重载
     *  在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
     *  跟方法的权限修饰符、返回值类型、形参变量名、方法体都没关系！
     */

    void recovery(float fBlood){
        this.hp += fBlood;
    }
    void recovery(int iBlood){
        this.hp +=iBlood;
    }
    void recovery(float fBlood,boolean debuff){
        if (debuff){
            this.hp += fBlood/2;
        }
    }

    /**
     * 获得当前攻击力
     * @return
     */
    public double getSumAttack(){
        return attack;
    }

    /**
     *  获得技能加成后的攻击力
     * @param skillAttack 技能加成
     * @return
     */
    public double getSumAttack(double skillAttack){
        return attack+skillAttack;
    }

    /**
     * 获得装备加成后的攻击力
     *  可变个数形参的格式：数据类型 ... 变量名
     *  可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
     *  可变个数形参在方法的形参中，必须声明在末尾
     * @param equipAttack 装备加成
     * @return
     */
    public double getSumAttack(int ... equipAttack){
        for (int i : equipAttack) {
//            System.out.println(i);
            attack += i;
        }
        return attack;
    }

    /**
     *   可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载。换句话说，二者不能共存。
     */
//    double getSumAttack(int[] equipAttack){   //getSumAttack(int[])' is already defined in 'pers.qkgit.JavaOOp.methodOverloading.Hero'
//        return 0;
//    }
}

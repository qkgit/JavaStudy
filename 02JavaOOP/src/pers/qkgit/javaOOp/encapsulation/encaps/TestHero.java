package pers.qkgit.javaOOp.encapsulation.encaps;

/**
 * @Author Qi
 * @data 2021/7/26 15:17
 *
 * 面向对象的特征一：封装与隐藏     3W:what? why? how?
 * 一、问题的引入：
 *  当我们创建一个类的对象以后，我们可以通过"对象.属性"的方式，对对象的属性进行赋值。这里，赋值操作要受到
 *  属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。但是，在实际问题中，我们往往需要给属性赋值
 *  加入额外的限制条件。这个条件就不能在属性声明时体现，我们只能通过方法进行限制条件的添加。（比如：setHp()）
 *  同时，我们需要避免用户再使用"对象.属性"的方式对属性进行赋值。则需要将属性声明为私有的(private).
 *  -->此时，针对于属性就体现了封装性。
 *
 * 二、封装性的体现：
 * 我们将类的属性xxx私有化(private),同时，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值
 *
 *  拓展：封装性的体现：① 如上  ② 不对外暴露的私有的方法  ③ 单例模式   ...
 *
 *
 */
public class TestHero {
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        System.out.println(garen.toString());

        garen.setArmor(83.4);
        System.out.println(garen.toString());

        garen.setHp(-100);
        System.out.println(garen.toString());

        /**
         *  缺省权限修饰符
         */
        pers.qkgit.javaOOp.encapsulation.permissionModifier.Hero teemo = new pers.qkgit.javaOOp.encapsulation.permissionModifier.Hero();
        /**
         * 属性
         */
//        teemo.name = "盖伦"; // 缺省的  私有的结构、缺省声明的结构就不可以调用了
        teemo.attack = 500;   // public
//        teemo.hp = 5000;    // private 出了Hero类  私有结构就不能使用

        /**
         * 方法
         */
        teemo.publicMethod();
//        teemo.defaultMethod();   // 缺省的  私有的结构、缺省声明的结构就不可以调用了
//        teemo.privateMethod();   // private 出了Hero类  私有结构就不能使用

    }
}

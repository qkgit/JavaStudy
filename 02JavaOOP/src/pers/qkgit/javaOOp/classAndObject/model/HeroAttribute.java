package pers.qkgit.javaOOp.classAndObject.model;

/**
 * @Author Qi
 * @data 2021/7/23 13:53
 */
public class HeroAttribute {
    //属性（或成员变量）
    public String attr;

    public void  method(int var){ //var:形参，也是局部变量
//        int b;   Variable 'b' might not have been initialized
        int b =1; //局部变量
        System.out.println(var+b);
    }

    public void callShuXing(){
        System.out.println(attr);
    }


}

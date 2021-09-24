package pers.qkgit.javaOOp.extendsClass.test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import pers.qkgit.javaOOp.extendsClass.model.ADC;
import pers.qkgit.javaOOp.extendsClass.model.Hero;
import pers.qkgit.javaOOp.extendsClass.model.Jin;

/**
 * @Auther Qi
 * @data 2021/9/18 17:02
 */
public class testExtends {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("hero");
        hero.legendary();
        System.out.println("*********");
        ADC adc = new ADC();
        adc.setName("adc");
        adc.legendary();
        adc.physicAttack();
        System.out.println("*********");
        Jin jin = new Jin();
        for (int i=0;i<5;i++){
            jin.physicAttack();
            System.out.println("____");
        }
        jin.legendary();

    }
}

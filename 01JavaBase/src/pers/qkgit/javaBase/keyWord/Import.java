package pers.qkgit.javaBase.keyWord;

import pers.qkgit.javaBase.keyWord.model.Hero;

import java.lang.reflect.Field;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * @Auther Qi
 * @data 2021/9/15 14:53
 */
public class Import {
    public static void main(String[] args) {

        String info = Arrays.toString(new int[]{1,2,3});
        ArrayList list = new ArrayList();
        HashMap map = new HashMap();
        Scanner s = null;
        System.out.println("hello!");
        // import static:导入指定类或接口中的静态结构:属性或方法。
        out.println("hello");          // import static java.lang.System.*;
        long num = round(123.434);     // import static java.lang.Math.*;

        Date date = new Date();
        //全类名的方式显示
        java.sql.Date date1 = new java.sql.Date(5243523532535L);

        Hero hero = new Hero();


    }
}

package pers.qkgit.javaOOp.classAndObject.javaBean;

/**
 * @Author Qi
 * @data 2021/7/26 17:51
 * JavaBean是一种Java语言写成的可重用组件。
 */
public class JavaBean {
    // 属性
    private int id;
    private String name;

    // 构造器
    public JavaBean() {
    }

    public JavaBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // get set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

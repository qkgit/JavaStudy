package pers.qkgit.javaOOp.customer;

/**
 *  构造器
 * @Author Qi
 * @data 2021/7/26 17:15
 *
 * 二、说明：
 * 1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 * 2.定义构造器的格式：权限修饰符  类名(形参列表){}
 * 3.一个类中定义的多个构造器，彼此构成重载
 * 4.一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 * 5.一个类中，至少会有一个构造器。
 */
public class Hero {

    private int id = 1;       // id
    private String name;  // 名称
    private int price;    // 价格


    public Hero(){
        System.out.println("Hero()................");
    }
    public Hero(String name){
        System.out.println("Hero(name)............");
        this.name = name;
    }
    public Hero(String name,int price){
        System.out.println("Hero(name,price)........");
        this.name = name;
        this.price = price;
    }



    public void duiXian(){
        System.out.println("正在对线。。。");
    }
    public void buBing(){
        System.out.println("正在补兵。。。");
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

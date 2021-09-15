package pers.qkgit.javaBase.keyWord.model;

/**
 * @Auther Qi
 * @data 2021/9/15 15:10
 */
public class Hero {
    private String name;
    private int age;

    public Hero(){
//		this.kill();
        String info = "Hero初始化时，需要考虑如下的1,2,3,4...(共40行代码)";
        System.out.println(info);
    }

    public Hero(String name){
        this();
        this.name = name;

    }

    public Hero(int age){
        this();
        this.age = age;

    }

    public Hero(String name,int age){
        this(age);
        this.name = name;
        //this.age = age;
        //Person初始化时，需要考虑如下的1,2,3,4...(共40行代码)
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }

    public void kill(){
        System.out.println("参与击杀");
        this.die();
    }
    public void die(){
        System.out.println("阵亡");
    }
}

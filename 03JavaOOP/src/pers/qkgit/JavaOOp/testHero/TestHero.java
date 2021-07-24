package pers.qkgit.JavaOOp.testHero;

/**
 * @Author Qi
 * @data 2021/7/21 14:44
 */
public class TestHero {


    public static void main(String[] args) {
        /**
         *  1.类和对象
         *
         */
        Hero garen = new Hero();
        Hero teemo =  new Hero();
        /**
         * 2.参数
         */
        garen.name = "盖伦";
        garen.hp = 857.0F;
        garen.armor = 34.3F;
        garen.moveSpeed = 297;

        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        System.out.println(garen.toString());
        System.out.println(teemo.toString());

        /**
         * 3.方法
         */
        garen.legendary();
        teemo.keng();
        float garenHp = garen.getHp();
        System.out.println("盖伦当前血量"+garenHp);
        garen.recovery(123.00f);
        garenHp = garen.getHp();
        System.out.println("盖伦当前血量"+garenHp);
    }

}


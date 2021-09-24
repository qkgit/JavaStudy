package pers.qkgit.javaOOp.extendsClass.model;

/**
 * @Auther Qi
 * @data 2021/9/18 16:55
 */
public class Jin extends ADC{

    public static int BULLET = 4; // 子弹 0-4

    public void diYu(){
        this.crit = 0; // 暴击率为0

        if (this.BULLET == 1){
            this.crit = 1;
            this.moveSpeed += 0.2 * this.moveSpeed;// 提高移速
            this.BULLET = 4;
        }
        if (this.BULLET == 0){
            shot();
        }

    }
    public void shot(){
        this.BULLET = 4;
        System.out.println("安装子弹");
    }

    @Override
    public void physicAttack() {
        System.out.println("暴击率："+this.crit+"  当前子弹："+BULLET);
        super.physicAttack();
        diYu();
        BULLET -= 1;
    }

    public Jin() {
        this.name = "烬";
    }
}

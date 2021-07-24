package pers.qkgit.JavaOOp.parameter;

/**
 * @Author Qi
 * @data 2021/7/23 14:02
 */
public class TestParam {
    public static void main(String[] args) {
        SXvsBL test = new SXvsBL();
        test.shuXing = "类属性";
        test.callShuXing();
        test.method(10);

    }
}

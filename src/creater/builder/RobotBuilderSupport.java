package creater.builder;/**
 * Created by Administrator on 2019/9/18.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName RobotBuilderSupport
 * @Description RobotBuilderSupport 实现 RobotBuilder 接口，并定义机器人属性便于子类继承
 * @Date 2019/9/18 17:34
 **/

public  abstract class RobotBuilderSupport implements RobotBuilder{
    // 这种方式是通过 RobotBuilder 保存 Robot 的属性，然后再赋予给 new Robot()
    private String head;
    private String leftHand;
    private String rightHand;
    private String leftFoot;
    private String rightFoot;

    // 可以在创建 RobotBuilder 的同时创建 Robot，然后在 setter 方法中给 robot 赋值，最后再通过 build() 返回
    //private Robot robot;

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(String leftHand) {
        this.leftHand = leftHand;
    }

    public String getRightHand() {
        return rightHand;
    }

    public void setRightHand(String rightHand) {
        this.rightHand = rightHand;
    }

    public String getLeftFoot() {
        return leftFoot;
    }

    public void setLeftFoot(String leftFoot) {
        this.leftFoot = leftFoot;
    }

    public String getRightFoot() {
        return rightFoot;
    }

    public void setRightFoot(String rightFoot) {
        this.rightFoot = rightFoot;
    }
}

package creater.builder;/**
 * Created by Administrator on 2019/9/18.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Robot
 * @Description 机器人
 * @Date 2019/9/18 16:13
 **/
public class Robot {
    private String head;
    private String leftHand;
    private String rightHand;
    private String leftFoot;
    private String rightFoot;

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

    @Override
    public String toString() {
        return "Robot{" +
                "head='" + head + '\'' +
                ", leftHand='" + leftHand + '\'' +
                ", rightHand='" + rightHand + '\'' +
                ", leftFoot='" + leftFoot + '\'' +
                ", rightFoot='" + rightFoot + '\'' +
                '}';
    }
}

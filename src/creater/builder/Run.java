package creater.builder;/**
 * Created by Administrator on 2019/9/18.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Run
 * @Description BUILDER demo
 * @Date 2019/9/18 17:48
 **/
public class Run {
    public static void main(String[] args) {
        // 创建一个残缺的机器人
        // 这里就相当于一个 Direction 类，指导如何创建一个机器人 -> 缺手缺脚的机器人
        Robot robot = new StandradRobotBuilder().buildHead().buildLeftFoot().buildLeftHand().build();
        // 也可以如书中，使用工厂方法来通过指令来命令 Direction 类创建各式各样的机器人

        System.out.println(robot);
    }
}

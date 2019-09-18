package creater.builder;/**
 * Created by Administrator on 2019/9/18.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName RobotBuilder
 * @Description 机器人 builder 接口，定义用于生成机器人的组件接口
 * @Date 2019/9/18 16:16
 **/
public interface RobotBuilder {
    // 返回 RobotBuilder 是用于可以流水式地构造 Robot 对象
    // Robot robot = new StandradRobotBuilder().buildHead().buildLeftFoot().buildLeftHand().build();
    RobotBuilder buildHead();
    RobotBuilder buildLeftHand();
    RobotBuilder buildrightHand();
    RobotBuilder buildLeftFoot();
    RobotBuilder buildrightFoot();
    Robot build();
}

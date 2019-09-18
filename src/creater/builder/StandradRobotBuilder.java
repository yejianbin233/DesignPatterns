package creater.builder;/**
 * Created by Administrator on 2019/9/18.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName StandradRobotBuilder
 * @Description 标准的机器人组件
 * @Date 2019/9/18 17:33
 **/
public class StandradRobotBuilder extends RobotBuilderSupport {
    @Override
    public RobotBuilder buildHead() {
        setHead("标准机器人头部");
        return this;
    }

    @Override
    public RobotBuilder buildLeftHand() {
        setLeftHand("标准机器人左手");
        return this;
    }

    @Override
    public RobotBuilder buildrightHand() {
        setRightHand("标准机器人右手");
        return this;
    }

    @Override
    public RobotBuilder buildLeftFoot() {
        setLeftFoot("标准机器人左脚");
        return this;
    }

    @Override
    public RobotBuilder buildrightFoot() {
        setRightFoot("标准机器人右脚");
        return this;
    }

    // 组装机器人
    @Override
    public Robot build() {
        Robot result = new Robot();
        result.setHead(getHead());
        result.setLeftHand(getLeftHand());
        result.setRightHand(getRightHand());
        result.setLeftFoot(getLeftFoot());
        result.setRightFoot(getRightFoot());
        return result;
    }
}

package creater.builder;/**
 * Created by Administrator on 2019/9/18.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Direction
 * @Description Direction 类，通过命令指导如何创建机器人
 * @Date 2019/9/18 17:58
 **/
public class Direction {
    private RobotBuilder robotBuilder;

    public Direction(String robotType){
        switch (robotType){
            case "standrad":
                robotBuilder = new StandradRobotBuilder();
                // ...
        }
    }
    public void order(String order){
        switch (order){
            case "head" :
                robotBuilder.buildHead();
                break;
            case "leftHand" :
                robotBuilder.buildLeftHand();
                break;
            case "rightHand" :
                robotBuilder.buildrightHand();
                break;
            case "leftFoot" :
                robotBuilder.buildLeftFoot();
                break;
            case "rightFoot" :
                robotBuilder.buildrightFoot();
                break;
        }
    }

    public Robot build(){
        return robotBuilder.build();
    }
}

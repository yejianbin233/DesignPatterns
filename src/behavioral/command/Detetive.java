package behavioral.command;/**
 * Created by Administrator on 2019/10/26.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Detetive
 * @Description 侦探
 * @Date 2019/10/26 10:17
 **/
public class Detetive {
    // 侦探需要执行的任务
    private List<Command> commands = new ArrayList<>();

    // 添加任务给侦探
    public void addComamd(Command command){
        commands.add(command);
    }
    // 侦探执行任务
    public void execute(){
        for (Command command : commands) {
            command.execute();
        }
    }
}

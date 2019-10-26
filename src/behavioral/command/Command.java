package behavioral.command;/**
 * Created by Administrator on 2019/10/26.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Command
 * @Description 命令接口 - 用于扩展命令 - 命令的唯一功能就是执行任务 - execute()
 *
 * 命令所需要的条件等限制，需要实现类自行定义
 * @Date 2019/10/26 10:11
 **/
public interface Command {
    // 暂设计为执行无返回值的命令
    void execute();
}

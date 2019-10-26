package behavioral.command;/**
 * Created by Administrator on 2019/10/26.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName DiffTaskCommand
 * @Description 困难的任务
 * @Date 2019/10/26 10:23
 **/
public class DiffTaskCommand implements Command{
    private Tool tool = new Tool("雪茄");
    @Override
    public void execute() {
        System.out.println("侦探开始执行困难任务，"+tool);
        System.out.println("困难任务如果没有雪茄怎么行呢!");
    }
}

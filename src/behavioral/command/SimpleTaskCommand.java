package behavioral.command;/**
 * Created by Administrator on 2019/10/26.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName SimpleTaskCommand
 * @Description 任务扩展 - 简单的任务 - 实现 Command 接口
 * @Date 2019/10/26 10:13
 **/
public class SimpleTaskCommand implements Command{
    // 任务执行工具，可以通过组合方式或参数传递（依赖方式）来传递执行所需的工具
    // 这里使用组合的方式传递一个"工具"对象来用于执行简单任务
    private Tool tool = new Tool("放大镜");
    @Override
    public void execute() {
        // 这里是编写简单任务的执行逻辑
        System.out.println("侦探开始执行简单的任务，"+tool);
    }
}

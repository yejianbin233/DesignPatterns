package behavioral.command;/**
 * Created by Administrator on 2019/10/26.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Test
 * @Description 命令模式测试
 * @Date 2019/10/26 10:31
 **/
public class Test {
    public static void main(String[] args) {
        Detetive detetive = new Detetive();
        // 添加任务 - 任务作为一个对象，被执行者添加并执行
        // 任务具有所有的执行条件，仅需要一个具体的执行者来执行
        /*
        * 命令模式将一个命令的执行对象与具体命令分开
        *
        *   1. 可以设计一个命令队列，将命令存储
        *   2. 执行者从命令队列中获取命令，判断是否需要执行、可以实现对命令的撤销、重做等操作
        * */
        detetive.addComamd(new SimpleTaskCommand());
        detetive.addComamd(new DiffTaskCommand());
        // 可以继续扩展一个新的任务 - 地狱级难度任务

        // 执行任务
        detetive.execute();
    }
}

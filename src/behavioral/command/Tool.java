package behavioral.command;/**
 * Created by Administrator on 2019/10/26.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Tool
 * @Description 为了不影响命令模式的结构 - Tool 不设计成接口形式
 * @Date 2019/10/26 10:25
 **/
public class Tool {
    private String toolName;
    public Tool(String name) {
        this.toolName = name;
    }

    @Override
    public String toString() {
        return "使用的工具：" + toolName;
    }
}

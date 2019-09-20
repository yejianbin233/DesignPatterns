package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Maze
 * @Description 迷宫
 * @Date 2019/9/20 14:58
 **/
public class Maze implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("maze clone ...");
        return super.clone();
    }
}

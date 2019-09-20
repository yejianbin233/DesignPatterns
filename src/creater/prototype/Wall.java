package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Wall
 * @Description 墙
 * @Date 2019/9/20 14:59
 **/
public class Wall implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("wall clone ...");
        return super.clone();
    }
}

package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName IronWall
 * @Description 铁墙
 * @Date 2019/9/20 15:42
 **/
public class IronWall extends Wall{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("我是铁墙...");
        return super.clone();
    }
}

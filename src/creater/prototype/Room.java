package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Room
 * @Description 房子
 * @Date 2019/9/20 14:59
 **/
public class Room implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("room clone ...");
        return super.clone();
    }
}

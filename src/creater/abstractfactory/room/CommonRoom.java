package creater.abstractfactory.room;/**
 * Created by Administrator on 2019/9/17.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Room
 * @Description Room 类，具有指向其他 MapSite 对象的引用（房间的四面分别与之对应）
 * @Date 2019/9/17 10:40
 **/
public class CommonRoom extends Room {
    @Override
    public String toString() {
        return "没有炸弹的房子.";
    }
}

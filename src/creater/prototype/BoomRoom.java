package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName BoomRoom
 * @Description 会爆炸的门 - 改变 Room 的实例为 BoombRoom 将通过该实例来克隆出会爆炸的门
 * @Date 2019/9/20 15:13
 **/
public class BoomRoom extends Room {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("boomRoom clone ...");
        return super.clone();
    }
}

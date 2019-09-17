package creater.abstractfactory;/**
 * Created by Administrator on 2019/9/17.
 */

import creater.abstractfactory.room.RoomComponent;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Wall
 * @Description 平平无奇的墙壁
 * @Date 2019/9/17 15:51
 **/
public class Wall implements RoomComponent{
    @Override
    public void show() {
        System.out.println("平平无奇的墙.");
    }
}

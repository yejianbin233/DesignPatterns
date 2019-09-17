package creater.abstractfactory.ordinary;/**
 * Created by Administrator on 2019/9/17.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Door
 * @Description Door 类
 * @Date 2019/9/17 10:45
 **/
public class Door implements RoomComponent {
    private Room room1
                ,room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }
}

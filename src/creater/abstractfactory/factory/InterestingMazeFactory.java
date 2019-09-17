package creater.abstractfactory.factory;/**
 * Created by Administrator on 2019/9/17.
 */

import creater.abstractfactory.Wall;
import creater.abstractfactory.door.Door;
import creater.abstractfactory.door.IncantationDoor;
import creater.abstractfactory.room.BoomRoom;
import creater.abstractfactory.room.Room;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName InterestingMazeFactory
 * @Description 有趣的迷宫，不仅有炸弹还能说咒语(b-box)
 * @Date 2019/9/17 16:03
 **/
public class InterestingMazeFactory implements MazeFactory{
    @Override
    public Room creatRoom() {
        return new BoomRoom();
    }

    @Override
    public Door createDoor() {
        return new IncantationDoor();
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }
}

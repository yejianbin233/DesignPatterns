package creater.abstractfactory.factory;/**
 * Created by Administrator on 2019/9/17.
 */

import creater.abstractfactory.Wall;
import creater.abstractfactory.door.CommonDoor;
import creater.abstractfactory.door.Door;
import creater.abstractfactory.room.CommonRoom;
import creater.abstractfactory.room.Room;


/**
 * @author yejianbin
 * @version 1.0
 * @ClassName CommonMazeFactory
 * @Description 普通的迷宫
 * @Date 2019/9/17 15:53
 **/
public class CommonMazeFactory implements MazeFactory{
    @Override
    public Room creatRoom() {
        return new CommonRoom();
    }

    @Override
    public Door createDoor() {
        return new CommonDoor();
    }

    @Override
    public Wall createWall() {
        return new Wall();
    }
}

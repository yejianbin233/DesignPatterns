package creater.abstractfactory.factory;


import creater.abstractfactory.Wall;
import creater.abstractfactory.door.Door;
import creater.abstractfactory.room.Room;

/**
 * Created by Administrator on 2019/9/17.
 */
public interface MazeFactory {
    Room creatRoom();
    Door createDoor();
    Wall createWall();
}

package creater.abstractfactory.ordinary;/**
 * Created by Administrator on 2019/9/17.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Maze
 * @Description Maze 类
 * @Date 2019/9/17 10:47
 **/
public class Maze {
    private List<Room> rooms;

    public Maze(){
        this.rooms = new ArrayList<>();
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public Room roomNo(int roomNo){
        return rooms.get(roomNo);
    }
}

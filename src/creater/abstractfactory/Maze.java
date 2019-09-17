package creater.abstractfactory;

import creater.abstractfactory.room.Room;
import creater.abstractfactory.room.RoomComponent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/17.
 */
public class Maze {
    private List<Room> rooms;

    public Maze() {
        this.rooms = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void showMaze(){
        Iterator<Room> it = rooms.iterator();
        while(it.hasNext()){
            Room room = it.next();
            System.out.println(room.toString());
            Map<Direction,RoomComponent> map= room.getSites();
            Iterator iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                map.get(iterator.next()).show();
            }

            System.out.println("========================");
        }
    }
}

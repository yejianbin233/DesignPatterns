package creater.abstractfactory.room;

import creater.abstractfactory.Direction;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/9/17.
 */
public abstract class Room {
    // 保存房间四个方位的数据
    private Map<Direction,RoomComponent> sites = new HashMap<>();
    private int roomNo;

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public Map<Direction,RoomComponent> getSites() {
        return sites;
    }

    public void setSites(Direction direction, RoomComponent roomComponent) {
        sites.put(direction,roomComponent);
    }
}

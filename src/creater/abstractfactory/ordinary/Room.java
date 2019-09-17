package creater.abstractfactory.ordinary;/**
 * Created by Administrator on 2019/9/17.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Room
 * @Description Room 类，具有指向其他 MapSite 对象的引用（房间的四面分别与之对应）
 * @Date 2019/9/17 10:40
 **/
public class Room {

    // 保存房间四个方位的数据
    private Map<Direction,RoomComponent> sites;
    private int roomNo;

    public Room(int roomNo) {
        this.roomNo = roomNo;
        sites = new HashMap<>();
    }



    public Map<Direction,RoomComponent> getSites() {
        return sites;
    }

    public void setSites(Direction direction,RoomComponent roomComponent) {
        sites.put(direction,roomComponent);
    }

}

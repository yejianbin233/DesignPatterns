package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName BoomMazePrototypeFactory
 * @Description 会爆炸的迷宫
 * @Date 2019/9/20 15:14
 **/
public class BoomMazePrototypeFactory extends MazePrototypeFactory {
    // 注意，这里我显示修改了 Room -> RoomRoom，BoomMazePrototypeFactory 将只能克隆出能爆炸的房子
    public BoomMazePrototypeFactory(Maze mazePrototy, BoomRoom roomPrototy, Wall wallPrototy, Door doorPrototy) {
        super(mazePrototy, roomPrototy, wallPrototy, doorPrototy);
    }

    @Override
    public Door getDoorPrototype() throws CloneNotSupportedException {
        Door door = super.getDoorPrototype();
        door.initialize("我扩展了 Door 类的克隆方式（自定义扩展）");
        return door;
    }
}

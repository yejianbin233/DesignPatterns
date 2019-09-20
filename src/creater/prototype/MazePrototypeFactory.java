package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName MazePrototypeFactory
 * @Description 迷宫原型工厂（通用）
 * @Date 2019/9/20 15:00
 **/
public class MazePrototypeFactory {
    // 创建迷宫所使用的原型实例
    private Maze mazePrototy;
    private Room roomPrototy;
    private Wall wallPrototy;
    private Door doorPrototy;

    public MazePrototypeFactory(Maze mazePrototy,
                                Room roomPrototy,
                                Wall wallPrototy,
                                Door doorPrototy) {
        this.mazePrototy = mazePrototy;
        this.roomPrototy = roomPrototy;
        this.wallPrototy = wallPrototy;
        this.doorPrototy = doorPrototy;
    }

    // 原型实例使用重载 Object 的 clone() 来生成实例
    public Maze getMazePrototype() throws CloneNotSupportedException {
        return (Maze) mazePrototy.clone();
    }
    public Room getRoomPrototype() throws CloneNotSupportedException {
        return (Room) roomPrototy.clone();
    }
    public Wall getWallPrototype() throws CloneNotSupportedException {
        return (Wall) wallPrototy.clone();
    }
    public Door getDoorPrototype() throws CloneNotSupportedException {
        return (Door) doorPrototy.clone();
    }
}

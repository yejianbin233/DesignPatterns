package creater.abstractfactory.ordinary;/**
 * Created by Administrator on 2019/9/17.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName MazeGame
 * @Description MazeGame 类
 * @Date 2019/9/17 10:49
 **/
public class MazeGame {
    // 普通的创建方式 - 硬编码
    public Maze createMaze(){
        // 创建迷宫
        Maze maze = new Maze();
        // 创建房子
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        // 创建门，关联两个房子
        Door door1 = new Door(r1,r2);
        // 迷宫添加防止
        maze.addRoom(r1);
        maze.addRoom(r2);

        // 添加房间的四个方位的数据信息
        r1.setSites(Direction.North,new Wall());
        r1.setSites(Direction.East,door1);
        r1.setSites(Direction.South,new Wall());
        r1.setSites(Direction.West,new Wall());

        r2.setSites(Direction.North,new Wall());
        r2.setSites(Direction.East,new Wall());
        r2.setSites(Direction.South,new Wall());
        r2.setSites(Direction.West,door1);

        return maze;

        /*
        * 这是一个复杂的创建过程，虽然仅仅创建了一个包含两个房子的迷宫。
        * */


        /*
        * 如果需要进行扩展，如：创建一扇需要咒语才能被打开的门和一个有不同寻常东西的房间（游戏中的场景...）
        *
        * 有以下几种方式：
        *
        * 1. 创建一个 MazeGame 的子类，并重定义 createMaze()，从而改变被实例化的类 - Factory Method
        *
        * 2. 传递一个对象给 createMaze() 做参数来创建房子、墙壁和门，可以传递不同的参数来"改变"房子、墙壁和门的"类" - Abstract Factory
        *
        * 3. 传递一个对象给 createMaze()，这个对象可以在所创建的迷宫中"使用"增加房子、墙壁和门的"操作"，来全面创建一个新的迷宫，
        *    那么可以使用"继承"来改变迷宫的一些部分或该迷宫被建造的方式 - Builder
        *
        * 4. 如果 createMaze() 由多种原型的房间、墙壁和门对象参数化，它拷贝并将这些对象增加到迷宫中，那么可以使用不同的对象"替换"这些原型以改变迷宫的构成 - Prototype
        *
        * Singleton 保证每个游戏中仅有一个迷宫，而且所有游戏对象可以迅速访问它。
        * */

        /*
        * 个人理解（修订...）：
        *
        * 工厂方法模式（Factory Method） - 定义一个 MazeGame 工厂，如果想要通过 createMaze 来扩展更多的 Maze，就需要继承 MazeGame 类并重载 createMaze()，
        *                                同时也需要新创建一个工厂类继承 MazeGame 工厂类，来创建新的 Maze 子类。
        *                                然后根据所需要的 Maze 来使用工厂方法模式来创建对应的 MazeGame 子类。
        *
        * 优点：
        *   1. 不用修改原有的代码
        *   2. 可以根据新需求来动态扩展（需要创建新的工厂类和新功能子类）
        *
        * 缺点：
        *   1. 会增加工厂类和功能类的子类数量
        *
        * 抽象工厂模式（Abstract Factory） - 创建一个产品簇工厂（MazeGameFactory），创建并扩展不同的 MazeGame（每个 MazeGame 都包含一整套创建逻辑代码），通过改变 MazeGame 的类型来创建不同的 Maze
        * */
    }

    public static void main(String[] args) {
        new MazeGame().createMaze();
    }
}

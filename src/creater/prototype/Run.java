package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Run
 * @Description Run
 * @Date 2019/9/20 15:17
 **/
public class Run {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        * 说明 >> 代码仅供参考，因此没有实际的属性并且 clone 也仅仅是调用 Object 的 clone() - 浅拷贝
        * */

        // 注意构造参数的变化
        MazePrototypeFactory mazePrototypeFactory = new MazePrototypeFactory
                ( new Maze(),
                  new Room(),
                  new Wall(),
                  new Door());

        // MazePrototypeFactory 使用的是默认的原型
        // 通过调用方法，可以克隆出 MazePrototypeFactory 内部原型实例的克隆对象
        mazePrototypeFactory.getMazePrototype();
        mazePrototypeFactory.getRoomPrototype();
        mazePrototypeFactory.getWallPrototype();
        mazePrototypeFactory.getDoorPrototype();

        // 当需要新的原型时 >> BoomMazePrototypeFactory
        MazePrototypeFactory boom = new BoomMazePrototypeFactory
                (new Maze(),
                 new BoomRoom(),// 这里我限制了 Room 类型的使用，只能传递 BoomRoom 类型的原型，通过该方式来扩展
//                 new Room(),
                 new IronWall(),// 为了演示，对照，我弄了个铁墙...
                 new Door());
        System.out.println("======");
        boom.getMazePrototype();
        boom.getRoomPrototype();
        boom.getWallPrototype();
        // BoomMazePrototypeFactory 重写了 MazePrototypeFactory 的 getDoortPrototype() 
        boom.getDoorPrototype();


        // 类动态配置 - 当要继续扩展时，可以动态传入原型进行扩展。为了演示效果，我限制了 Room -> BoomRoom

        /*
        * 从大话设计模式到 GOF，我都知道原型模式是通过指定原型实例来克隆出实例。但是想不明白：
        *
        * 1. 克隆也是创建对象啊（指深拷贝），克隆和直接 new 有什么不同...
        *
        * 2. 如何指定克隆新对象，在我的认知里还是通过子类来创建
        *
        * 当完完全全写一遍代码后，有点理解了，对照之后理解更深了。
        *
        * 个人思考 -
        *
        * 1. 设计模式就是需要配合使用（配合其他类来实现可扩展性、可维护性），思考的角度需要改变。
        *
        * 2. 要实际编码，想象应用环境。并且不是脑子看了一遍书，脑子：好的！我理解了。手：不，你没有...
        * */

        /*
        *
        * 原型的特点：
        *
        * 1. 一定要有 clone 方法，用于克隆原型实例
        *
        * 2. 实现原型的子类可以扩展原型，指定不同子类来进行实例化
        *
        * 3. 在原型中定义个性化方法（initialize()）可以在扩展原型子类的同时，重写该方法进行个性化实现
        * */
    }
}

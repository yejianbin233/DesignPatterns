package creater.singleton;/**
 * Created by Administrator on 2019/9/24.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName RobotLazySingleton
 * @Description 单例模式
 * @Date 2019/9/24 14:36
 **/
public class Robot {
    /*
    * Java 将默认的无参构造函数私有化后，
    *
    * 如若不：
    *   1. 定义其他构造函数
    *   2. 不使用反射
    *
    * 将不能在其他类中构造一个 Robot 的新实例。
    * */
    private Robot(){}
    /*
    * 饿汉模式 - 通过静态初始化创建一个 Robot 实例，然后提供 getRobotHungrySingleton() 提供方位
    *
    * 优点：避免了线程安全问题（在类加载时就进行实例化.）
    *
    * 缺点：
    *
    *   1. 在类被加载时就实例化，可能会造成不必要的浪费（如果不被使用.）
    *   2. 如果类被多次加载，也会造成多次实例化
    *
    * 解决方式：
    *
    *   1. 静态内部类
    *   2. 懒汉模式
    * */
    private static final Robot hungryRobot = new Robot();
    public static Robot getRobotHungrySingleton(){
        return hungryRobot;
    }
    // ========================================================
    /*
    * 静态内部类 - 同样是利用类加载机制来保证初始化实例时的线程安全问题，
    * 但静态内部类方式与饿汉模式不同，只有当调用 getRobotInstance() 方法时，
    * 才会加载静态内部类 RobotSingleton，从而实例化 instance。
    *
    * 静态内部类已经解决了单例模式的两个问题：
    *
    *   1. 单例化
    *   2. 线程安全问题
    * */
    private static class RobotSingletonSafe{
        private static final Robot instance = new Robot();
        public static Robot getInstance(){
            return instance;
        }
    }
    public static Robot getRobotInstanceSafe(){
        return RobotSingletonSafe.getInstance();
    }
    // ========================================================

    // ========================================================
    /*
    * 懒汉模式 - 不提前实例化 Robot 实例，将实例化延迟到第一次调用时才开始实例化。
    *
    * 优点：懒加载
    * 缺点：线程安全问题 - 并发环境中 if (lazyRobot == null) 条件判断存在线程安全问题
    * */
    private static Robot lazyRobot;
    public static Robot getLazyRobot(){
        if (lazyRobot == null) {
            lazyRobot = new Robot();
        }
        return lazyRobot;
    }

    // ========================================================

    // ========================================================
    /*
    * 懒汉模式 - 使用 synchronize 同步锁解决线程安全问题
    *
    * 缺点：使用 synchronize 同步锁的效率低
    * */
    private static Robot lazyRobotSync;
    public static synchronized Robot getLazyRobotSyncSafe(){
        if (lazyRobot == null) {
            lazyRobot = new Robot();
        }
        return lazyRobot;
    }

    // ========================================================

    // ========================================================
    /*
    * 懒汉模式 - 双重校验锁,缩小 synchronize 同步锁的范围
    *
    * 缺点：仍然存在线程安全问题 - 指令重排序
    *
    * 解决方案：
    *
    * 1. 使用 volatile 关键字，禁止重排序 - private static volatile Robot instanceCheck;
    * 2. 使用 final 关键字
    * */
    private static Robot instanceCheck;
    public static Robot getInstanceCheck(){
        if (instanceCheck == null) {
            synchronized (Robot.class){
                if (instanceCheck == null) {
                    instanceCheck = new Robot();
                }
            }
        }
        return instanceCheck;
    }

    // ========================================================

    // ========================================================
    /*
    * 使用枚举 - 返回 RobotSingleton 枚举类的单例（演示）.
    *
    * 优点：
    *
    *   1. 解决线程安全问题
    *   2. 私有化构造器并不安全，使用枚举类可以防止反射
    *   3. 类序列化前后并不相等，使用枚举类后单例序列化前后都会相同
    * */
    public enum  RobotSingleton {
        INSTANCE;
        public RobotSingleton getInstance(){
            return INSTANCE;
        }
    }
    // ========================================================
    /*
    * 推荐通过枚举类来定义单例.
    * */
}

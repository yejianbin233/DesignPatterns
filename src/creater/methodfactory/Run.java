package creater.methodfactory;/**
 * Created by Administrator on 2019/9/19.
 */

import creater.methodfactory.factory.ProductFirstMethodFactory;
import creater.methodfactory.factory.ProductMethodFactory;
import creater.methodfactory.factory.ProductSecondMethodFactory;
import creater.methodfactory.product.Product;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Run
 * @Description demo
 * @Date 2019/9/19 15:28
 **/
public class Run {
    public static void main(String[] args) {
        // ProductMethodFactory 可以定义为接口 / 抽象类（复用代码、继承属性）
        ProductMethodFactory factory = null;
        // Product 可以定义为接口 / 抽象类（复用代码、继承属性）
        Product product = null;

        /*
        * 场景：
        *
        * ProductMethodFactory 用于创建 Product，可是 Product 会在后续继续研发出新的型号
        *
        * 因此 ProductMethodFactory 无法一次性定义出创建 Product 全部型号的方法。
        *
        * 每出一个新型号，都必须修改 ProductMethodFactory 的 create() 方法，这违背了"开放 - 封闭"原则
        *
        * 因此，需要将创建 Product 实例的过程延迟到 ProductMethodFactory 的子类，在需要使用时手动创建其子类。
        * */

        // 指定创建 Product 的工厂实现类
        factory = new ProductFirstMethodFactory();
        Product productFirst = factory.createProduct();
        productFirst.show();

        // 指定创建 Product 的工厂实现类
        factory = new ProductSecondMethodFactory();
        Product productSeconds = factory.createProduct();
        productSeconds.show();

        // 当需要更新工厂方法和 Product 的型号时，通过创建实现 ProductMethodFactory 或 Product 的子类来实现扩展
        // factory = new ProductThree...
        // Product productThree = factory.createProduct();
        // ...
    }
}

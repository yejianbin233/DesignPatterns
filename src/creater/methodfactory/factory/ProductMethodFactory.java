package creater.methodfactory.factory;/**
 * Created by Administrator on 2019/9/19.
 */

import creater.methodfactory.product.Product;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName ProductMethodFactory
 * @Description 使用工厂方法模式创建产品的工厂，生成 Product 衍生的各种子产品
 * @Date 2019/9/19 15:15
 **/
public interface ProductMethodFactory {
    public Product createProduct();
}

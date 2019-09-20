package creater.methodfactory.factory;/**
 * Created by Administrator on 2019/9/19.
 */

import creater.methodfactory.product.Product;
import creater.methodfactory.product.ProductSeconds;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName ProductSecondMethodFactory
 * @Description Product second 型号产品生产工厂
 * @Date 2019/9/19 15:25
 **/
public class ProductSecondMethodFactory implements ProductMethodFactory{
    @Override
    public Product createProduct() {
        return new ProductSeconds();
    }
}

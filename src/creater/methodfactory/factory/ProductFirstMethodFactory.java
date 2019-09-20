package creater.methodfactory.factory;/**
 * Created by Administrator on 2019/9/19.
 */

import creater.methodfactory.product.Product;
import creater.methodfactory.product.ProductFirst;

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName ProductFirstMethodFactory
 * @Description Product First 型号产品生产工厂
 * @Date 2019/9/19 15:25
 **/
public class ProductFirstMethodFactory implements ProductMethodFactory {
    @Override
    public Product createProduct() {
        return new ProductFirst();
    }
}

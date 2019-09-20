package creater.methodfactory.product;/**
 * Created by Administrator on 2019/9/19.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName ProductSeconds
 * @Description Product Second 型号
 * @Date 2019/9/19 15:22
 **/
public class ProductSeconds implements Product{
    @Override
    public void show() {
        System.out.println("I am second.");
    }
}

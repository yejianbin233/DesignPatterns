package creater.abstractfactory.door;/**
 * Created by Administrator on 2019/9/17.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName CommonDoor
 * @Description 普通的门
 * @Date 2019/9/17 15:48
 **/
public class CommonDoor implements Door {

    @Override
    public void show() {
        System.out.println("平平无奇的门");
    }
}

package creater.abstractfactory.door;/**
 * Created by Administrator on 2019/9/17.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName IncantationDoor
 * @Description 咒语门
 * @Date 2019/9/17 15:49
 **/
public class IncantationDoor implements Door{

    @Override
    public void show() {
        System.out.println("只有会 b-box 的人才能进门");
    }
}

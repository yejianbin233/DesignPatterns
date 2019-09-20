package creater.prototype;/**
 * Created by Administrator on 2019/9/20.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Door
 * @Description 门
 * @Date 2019/9/20 14:59
 **/
public class Door implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("door clone...");
        return super.clone();
    }

    public void initialize(String customizeStr){
        System.out.println("\n\n");
        System.out.println("Door initialize ---" + customizeStr);
    }
}

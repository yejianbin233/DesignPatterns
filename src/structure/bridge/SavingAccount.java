package structure.bridge;/**
 * Created by Administrator on 2019/10/19.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName SavingAccount
 * @Description 定期账号类型
 * @Date 2019/10/19 9:51
 **/
public class SavingAccount implements Account {

    @Override
    public void showAccountType() {
        System.out.println("定期账号");
    }
}

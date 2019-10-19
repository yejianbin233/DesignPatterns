package structure.bridge;

/**
 * Created by Administrator on 2019/10/19.
 *
 * 银行活期账号类型
 */
public class DepositAccount implements Account{
    @Override
    public void showAccountType() {
        System.out.println("活期账号");
    }
}

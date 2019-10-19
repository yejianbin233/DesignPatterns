package structure.bridge;/**
 * Created by Administrator on 2019/10/19.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName ABCBank
 * @Description 农业银行
 * @Date 2019/10/19 9:56
 **/
public class ABCBank extends Bank{
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    void openAccount() {
        System.out.println("使用农业银行，账号类型：");
        account.showAccountType();
    }
}

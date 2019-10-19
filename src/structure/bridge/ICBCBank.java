package structure.bridge;/**
 * Created by Administrator on 2019/10/19.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName ICBCBank
 * @Description 工商银行
 * @Date 2019/10/19 9:54
 **/
public class ICBCBank extends Bank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    void openAccount() {
        System.out.println("使用工商银行，账号类型：");
        this.account.showAccountType();
    }
}

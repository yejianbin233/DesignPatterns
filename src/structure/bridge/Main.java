package structure.bridge;/**
 * Created by Administrator on 2019/10/19.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Main
 * @Description TODO
 * @Date 2019/10/19 9:57
 **/
public class Main {
    public static void main(String[] args) {
        // 使用工商银行的两种类型账号 - 两种排列组合方式
        Bank ICBC_Saving = new ICBCBank(new SavingAccount());
        Bank ICBC_Deposit = new ICBCBank(new DepositAccount());
        ICBC_Saving.openAccount();
        ICBC_Deposit.openAccount();

        // 使用农业银行的两种类型账号 - 两种排列组合方式
        Bank ABC_Saving = new ABCBank(new SavingAccount());
        Bank ABC_Deposit = new ABCBank(new DepositAccount());
        ABC_Saving.openAccount();
        ABC_Deposit.openAccount();

        /*
        *
        * 再有其他类型的银行 / 账号类型需要扩展，分别通过：
        *
        *   1. 继承 Bank 实现子类扩展
        *   2. 实现 Accouont 接口扩展后
        *  （拓展功能，实现独立的编号）
        *
        *   再通过组合（减少实现类的数量，当需要时传入对象）的方式使用就好了。
        *
        * **/

    }
}

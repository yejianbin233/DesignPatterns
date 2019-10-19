package structure.bridge;/**
 * Created by Administrator on 2019/10/19.
 */

/**
 * @author yejianbin
 * @version 1.0
 * @ClassName Bank
 * @Description
 *
 *  现在有一个银行业务，开发各种银行（中国农业银行、工商银行...）以及账号类型（定期、活期类型）
 *
 *  可以很清晰的看到，银行的类型和账号的类型是变化的，而且很可能独立变化，不同银行的账号类型使用方式不同
 *
 *  那么可以使用 "桥接模式"，满足：
 *
 *      1. 存在多个维度独立地变化
 *      2. 存在排列组合（不同银行与不同类型排列匹配）
 *
 *   实现：创建银行抽象类与账号类型接口
 *
 *      1. 银行通过组合的方式与账号类型配合
 *      2. 银行独立地变化
 *      3. 账号类型独立地变化
 *
 * @Date 2019/10/19 9:39
 **/
public abstract class Bank {
    protected Account account;

    public Bank(Account account){
        this.account = account;
    }

    // 抽象部分，用于被子类根据业务情况来实现
    abstract void openAccount();
}

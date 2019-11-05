package facade.subsystem;

/**
 * Created by DEll on 2019-11-5.
 * 子系统中的类
 * 负责检查字符串中字符数量，数量被其他类依赖
 */
public class CheckWord {
    public final int basicAmount = 85;
    String advertisement ;
    int amount;
    public CheckWord(String advertisement){
        this.advertisement = advertisement;
    }

    public void setChargeAmount(){
        amount = advertisement.length() + basicAmount;
    }

    public int getAmount(){
        return amount;
    }
}

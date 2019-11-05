package facade.subsystem;

/**
 * Created by DEll on 2019-11-5.
 * 子系统中的类
 * 负责结算费用，依赖checkWord类返回的数量
 */
public class Charge {
    public final int basicCharge = 12;
    CheckWord checkWord;

    public Charge(CheckWord checkWord){
        this.checkWord =  checkWord;
    }

    public void giveCharge(){
        int charge = checkWord.getAmount() * basicCharge;
        System.out.println("广告费用："+charge+"元");
    }
}

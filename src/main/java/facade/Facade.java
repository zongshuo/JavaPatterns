package facade;

import facade.subsystem.Charge;
import facade.subsystem.CheckWord;
import facade.subsystem.TypeSetting;

/**
 * Created by DEll on 2019-11-5.
 * 外观类
 * 包含子系统中的全部或部分类
 * 负责客户端与子系统的交互
 */
public class Facade {
    private CheckWord checkWord;
    private Charge charge;
    private TypeSetting typeSetting;
    String advertisement;

    public Facade(String advertisement){
        this.advertisement = advertisement;
        checkWord = new CheckWord(advertisement);
        charge = new Charge(checkWord);
        typeSetting = new TypeSetting(advertisement);
    }

    public void doAdvertisement(){
        checkWord.setChargeAmount();
        charge.giveCharge();
        typeSetting.typeSetting();
    }
}

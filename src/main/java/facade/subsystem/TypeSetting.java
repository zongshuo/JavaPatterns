package facade.subsystem;

/**
 * Created by DEll on 2019-11-5.
 * 子系统中的类
 */
public class TypeSetting {
    String advertisement;
    public TypeSetting(String advertisement){
        this.advertisement = advertisement;
    }

    public void typeSetting(){
        System.out.println("广告排版格式");
        System.out.println("********");
        System.out.println(advertisement);
        System.out.println("********");
    }
}

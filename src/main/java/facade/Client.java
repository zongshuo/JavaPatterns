package facade;

/**
 * Created by DEll on 2019-11-5.
 * 客户端
 * 直接与外观类进行交互
 */
public class Client {
    public static void main(String [] args){
        Facade facade ;
        String advertisement = "月光电脑，价格6356元，联系电话:1234567";
        facade = new Facade(advertisement);
        facade.doAdvertisement();
    }
}

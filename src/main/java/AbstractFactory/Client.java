package abstractFactory;

import abstractFactory.factory.BeijingClothesFactory;
import abstractFactory.factory.ClothesFactory;
import abstractFactory.factory.ShanghaiClothesFactory;

/**
 * Created by DEll on 2019-11-5.
 */
public class Client {
    public static void main(String [] args){
        Shop shop = new Shop();
        ClothesFactory clothesFactory = new BeijingClothesFactory();
        shop.giveSuit(clothesFactory, 90, 80, 170);
        shop.showMess();
        clothesFactory = new ShanghaiClothesFactory();
        shop.giveSuit(clothesFactory, 90, 80, 170);
        shop.showMess();
    }
}

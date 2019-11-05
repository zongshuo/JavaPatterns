package abstractFactory.factory;

import abstractFactory.product.Trousers;
import abstractFactory.product.UpperClothes;
import abstractFactory.product.WesternTrousers;
import abstractFactory.product.WesternUpperClothes;

/**
 * Created by DEll on 2019-11-5.
 * 具体工厂
 * 生产北京衣服厂的产品
 */
public class BeijingClothesFactory extends ClothesFactory {
    @Override
    public UpperClothes createUpperClothes(int chestSize, int height) {
        return new WesternUpperClothes(chestSize, height, "北京牌西装上衣");
    }

    @Override
    public Trousers createTrousers(int waistSize, int height) {
        return new WesternTrousers(waistSize, height, "北京牌西装裤子");
    }
}

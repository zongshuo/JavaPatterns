package abstractFactory.factory;

import abstractFactory.product.CowBoyTrousers;
import abstractFactory.product.CowBoyUpperClothes;
import abstractFactory.product.Trousers;
import abstractFactory.product.UpperClothes;

/**
 * Created by DEll on 2019-11-5.
 * 具体工厂
 * 生产上海衣服生产厂
 */
public class ShanghaiClothesFactory extends ClothesFactory{
    @Override
    public UpperClothes createUpperClothes(int chestSize, int height) {
        return new CowBoyUpperClothes(chestSize, height, "牛仔上衣");
    }

    @Override
    public Trousers createTrousers(int waistSize, int height) {
        return new CowBoyTrousers(waistSize, height, "牛仔裤子");
    }
}

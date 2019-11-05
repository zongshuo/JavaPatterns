package abstractFactory.factory;

import abstractFactory.product.Trousers;
import abstractFactory.product.UpperClothes;

/**
 * Created by DEll on 2019-11-5.
 * 抽象工厂
 * 抽象出一套衣服的两个组件
 */
public abstract class ClothesFactory {
    public abstract UpperClothes createUpperClothes(int chestSize, int height);
    public abstract Trousers createTrousers(int waistSize, int height);
}

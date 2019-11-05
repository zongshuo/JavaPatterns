package factoryMethod.factory;

import factoryMethod.product.BluePanCoreConcreteProduct;
import factoryMethod.product.PanCoreProduct;

/**
 * Created by DEll on 2019-11-4.
 * 具体构造者
 * 实现了构造者的抽象方法，返回了蓝色的圆珠笔
 */
public class BlueBallPanCreator extends BallPanCreator {
    @Override
    public PanCoreProduct getPanCore() {
        return new BluePanCoreConcreteProduct();
    }
}

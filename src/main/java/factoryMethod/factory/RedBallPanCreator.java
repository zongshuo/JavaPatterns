package factoryMethod.factory;

import factoryMethod.product.PanCoreProduct;
import factoryMethod.product.RedPanCoreConcreteProduct;

/**
 * Created by DEll on 2019-11-4.
 * 具体构造者
 * 实现了构造者的抽象方法，返回了红色的笔芯
 */
public class RedBallPanCreator extends BallPanCreator {
    @Override
    public PanCoreProduct getPanCore() {
        return new RedPanCoreConcreteProduct();
    }
}

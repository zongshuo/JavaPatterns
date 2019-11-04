package mediator.factory;

import mediator.product.BlackPanCoreConcreteProduct;
import mediator.product.PanCoreProduct;

/**
 * Created by DEll on 2019-11-4.
 * 具体构造者
 * 实现了构造者的抽象方法，返回了黑色的圆珠笔
 */
public class BlackBallPanCreator extends BallPanCreator {
    @Override
    public PanCoreProduct getPanCore() {
        return new BlackPanCoreConcreteProduct();
    }
}

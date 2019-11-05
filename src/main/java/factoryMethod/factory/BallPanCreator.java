package factoryMethod.factory;

import factoryMethod.product.PanCoreProduct;

/**
 * Created by DEll on 2019-11-4.
 * 构造者
 * 定义了生产圆珠笔对象的方法
 */
public abstract class BallPanCreator {
    public BallPanCreator(){
        System.out.println("生产了一只装有"+getPanCore().color+"笔芯的圆珠笔");
    }

    public abstract PanCoreProduct getPanCore();
}

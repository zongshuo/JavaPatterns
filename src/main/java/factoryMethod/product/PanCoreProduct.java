package factoryMethod.product;

/**
 * Created by DEll on 2019-11-4.
 * 抽象产品
 * 定义了圆珠笔芯的基本属性
 */
public abstract class PanCoreProduct {
    public String color;
    public abstract void writeWord(String str);
}

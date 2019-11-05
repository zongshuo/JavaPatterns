package factoryMethod.product;

/**
 * Created by DEll on 2019-11-4.
 * 具体产品类
 * 实现一个红色的圆珠笔芯
 */
public class RedPanCoreConcreteProduct extends PanCoreProduct{

    public RedPanCoreConcreteProduct(){
        color = "红色";
    }
    @Override
    public void writeWord(String str) {
        System.out.println("写出"+color+"的字："+str);
    }
}

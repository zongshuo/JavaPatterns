package mediator.product;

/**
 * Created by DEll on 2019-11-4.
 * 具体产品
 * 实现了一个黑色的圆珠笔芯
 */
public class BlackPanCoreConcreteProduct extends PanCoreProduct{
    public BlackPanCoreConcreteProduct(){
        color = "黑色";
    }
    @Override
    public void writeWord(String str) {
        System.out.println("写出"+color+"的字："+str);
    }
}

package mediator.product;

/**
 * Created by DEll on 2019-11-4.
 * 具体产品
 * 实现了一个蓝色的圆珠笔
 */
public class BluePanCoreConcreteProduct extends PanCoreProduct{
    public BluePanCoreConcreteProduct(){
        color = "蓝色";
    }
    @Override
    public void writeWord(String str) {
        System.out.println("写出"+color+"的字："+str);
    }
}

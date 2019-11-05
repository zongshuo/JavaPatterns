package abstractFactory.product;

/**
 * Created by DEll on 2019-11-5.
 * 具体产品
 * 表示一件西装的上衣
 */
public class WesternUpperClothes extends UpperClothes{
    private int chestSize;
    private int height;
    private String name;

    public WesternUpperClothes(int chestSize, int height, String name){
        this.chestSize = chestSize;
        this.height = height;
        this.name = name;
    }

    @Override
    public int getChestSize() {
        return chestSize;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String getName() {
        return name;
    }
}

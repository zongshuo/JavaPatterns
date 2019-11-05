package abstractFactory.product;

/**
 * Created by DEll on 2019-11-5.
 * 具体产品
 * 表示了一件牛仔上衣
 */
public class CowBoyUpperClothes extends UpperClothes{
    private int chestSize;
    private int height;
    private String name;

    public CowBoyUpperClothes(int chestSize, int height, String name){
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

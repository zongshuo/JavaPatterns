package abstractFactory;

import abstractFactory.factory.ClothesFactory;
import abstractFactory.product.Trousers;
import abstractFactory.product.UpperClothes;

/**
 * Created by DEll on 2019-11-5.
 */
public class Shop {
    UpperClothes upperClothes;
    Trousers trousers;

    public void giveSuit(ClothesFactory factory, int chestSize, int waistSize, int height){
        upperClothes = factory.createUpperClothes(chestSize, height);
        trousers = factory.createTrousers(waistSize, height);
    }

    public void showMess(){
        System.out.println("<套装信息>");
        System.out.println(upperClothes.getName()+":");
        System.out.print("胸围："+upperClothes.getChestSize());
        System.out.println("身高："+upperClothes.getHeight());
        System.out.println(trousers.getName()+":");
        System.out.print("腰围："+trousers.getWaistSize());
        System.out.println("身高："+trousers.getHeight());
    }
}

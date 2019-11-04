package mediator;

import mediator.factory.BallPanCreator;
import mediator.factory.BlackBallPanCreator;
import mediator.factory.BlueBallPanCreator;
import mediator.factory.RedBallPanCreator;
import mediator.product.PanCoreProduct;

/**
 * Created by DEll on 2019-11-4.
 * 客户端
 */
public class Client {
    public static void main(String [] args){
        PanCoreProduct product ;
        BallPanCreator pan = new RedBallPanCreator();
        product = pan.getPanCore();
        product.writeWord("hello");

        pan = new BlueBallPanCreator();
        product = pan.getPanCore();
        product.writeWord("hello");

        pan = new BlackBallPanCreator();
        product = pan.getPanCore();
        product.writeWord("hello");
    }
}

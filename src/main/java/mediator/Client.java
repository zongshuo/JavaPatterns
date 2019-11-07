package mediator;

import mediator.colleague.ColleagueA;
import mediator.colleague.ColleagueB;
import mediator.colleague.ColleagueC;
import mediator.mediator.ConcreteMediator;
import mediator.mediator.Mediator;

/**
 * Created by DEll on 2019-11-6.
 * 客户端
 */
public class Client {
    public static void main(String [] args){
        Mediator mediator = new ConcreteMediator();
        ColleagueA a = new ColleagueA(mediator);
        ColleagueB b = new ColleagueB(mediator);
        ColleagueC c = new ColleagueC(mediator);

        a.setName("A国");
        b.setName("B国");
        c.setName("C国");

        String [] messA = {"要求归还曾抢夺的100斤土豆", "要求归还曾抢夺的20头牛"};
        String [] messB = {"要求归还曾抢夺的10只公鸡", "要求归还曾抢夺的15匹马"};
        String [] messC = {"要求归还曾抢夺的300斤小麦", "要求归还曾抢夺的50头驴"};

        a.giveMess(messA);
        b.giveMess(messB);
        c.giveMess(messC);
    }
}

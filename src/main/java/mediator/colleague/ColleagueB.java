package mediator.colleague;

import mediator.mediator.Mediator;

/**
 * Created by DEll on 2019-11-6.
 * 具体同事b
 */
public class ColleagueB implements Colleague{
    private Mediator mediator;
    private String name;
    public ColleagueB(Mediator mediator){
        this.mediator = mediator;
        this.mediator.registerColleagueB(this);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void giveMess(String[] mess) {
        mediator.deliverMess(this, mess);
    }

    @Override
    public void receiverMess(String mess) {
        System.out.println(this.name + "接收到消息："+mess);
    }
}

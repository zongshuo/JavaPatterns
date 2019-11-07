package mediator.colleague;

/**
 * Created by DEll on 2019-11-6.
 * 抽象同事
 * 抽象出每个同事的方法
 */
public interface Colleague {
    void setName(String name);
    String getName();
    void giveMess(String [] mess);
    void receiverMess(String mess);
}

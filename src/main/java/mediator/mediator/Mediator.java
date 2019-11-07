package mediator.mediator;

import mediator.colleague.Colleague;
import mediator.colleague.ColleagueA;
import mediator.colleague.ColleagueB;
import mediator.colleague.ColleagueC;

/**
 * Created by DEll on 2019-11-6.
 * 中介者
 * 定义具体中介者需要实现的方法
 */
public interface Mediator {
    void registerColleagueA(ColleagueA colleagueA);
    void registerColleagueB(ColleagueB colleagueB);
    void registerColleagueC(ColleagueC colleagueC);
    void deliverMess(Colleague colleague, String [] mess);
}

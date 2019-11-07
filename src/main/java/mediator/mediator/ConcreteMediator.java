package mediator.mediator;

import mediator.colleague.Colleague;
import mediator.colleague.ColleagueA;
import mediator.colleague.ColleagueB;
import mediator.colleague.ColleagueC;

/**
 * Created by DEll on 2019-11-6.
 * 具体中介者
 */
public class ConcreteMediator implements Mediator{
    private ColleagueA colleagueA;
    private ColleagueB colleagueB;
    private ColleagueC colleagueC;
    @Override
    public void registerColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    @Override
    public void registerColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void registerColleagueC(ColleagueC colleagueC) {
        this.colleagueC = colleagueC;
    }

    @Override
    public void deliverMess(Colleague colleague, String[] mess) {
        if(colleague == colleagueA) {
            if (mess.length >= 2) {
                colleagueB.receiverMess(colleague.getName() + mess[0]);
                colleagueC.receiverMess(colleague.getName() + mess[1]);
            }
        }else if(colleague == colleagueB) {
            if (mess.length >= 2) {
                colleagueA.receiverMess(colleague.getName() + mess[0]);
                colleagueC.receiverMess(colleague.getName() + mess[1]);
            }
        }else if(colleague == colleagueC){
                if(mess.length >= 2){
                    colleagueA.receiverMess(colleague.getName()+mess[0]);
                    colleagueB.receiverMess(colleague.getName()+mess[1]);
                }
        }
    }
}

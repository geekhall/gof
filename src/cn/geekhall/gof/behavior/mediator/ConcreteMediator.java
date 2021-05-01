package cn.geekhall.gof.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yiny
 * @Type ConcreteMediator.java
 * @Desc
 * @date 5/1/21 7:29 PM
 */
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague colleague) {
        for (Colleague c : colleagues){
            if(!c.equals(colleague)){
                c.receive();
            }
        }
    }
}

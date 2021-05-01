package cn.geekhall.gof.behavior.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author yiny
 * @Type ObjectStructure.java
 * @Desc 对象结构角色
 * @date 5/1/21 8:25 PM
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    void accept(Visitor visitor){
        for (Element element : list) {
            element.accept(visitor);
        }
    }

    public void add(Element element){
        list.add(element);
    }

    public void remove(Element element){
        list.remove(element);
    }
}

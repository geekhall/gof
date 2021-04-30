package cn.geekhall.gof.structure.composite;

import java.util.ArrayList;

/**
 * @author yiny
 * @Type Branch.java
 * @Desc
 * @date 4/29/21 1:57 PM
 */
public class Branch implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children){
            ((Component)obj).operation();
        }
    }
}

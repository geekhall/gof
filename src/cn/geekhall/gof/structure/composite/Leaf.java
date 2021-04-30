package cn.geekhall.gof.structure.composite;

/**
 * @author yiny
 * @Type Leaf.java
 * @Desc
 * @date 4/29/21 1:54 PM
 */
public class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "被访问！");
    }
}

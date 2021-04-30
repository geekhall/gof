package cn.geekhall.gof.structure.composite;

/**
 * @author yiny
 * @Type Component.java
 * @Desc 抽象构件
 * @date 4/29/21 1:54 PM
 */
interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
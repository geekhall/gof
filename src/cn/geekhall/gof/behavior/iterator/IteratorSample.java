package cn.geekhall.gof.behavior.iterator;

/**
 * @author yiny
 * @Type IteratorSample.java
 * @Desc
 * @date 5/1/21 7:49 PM
 */
public class IteratorSample {
    public static void execute() {
        System.out.println("==================== 行为型模式 8 : 迭代器模式（Iterator） Sample START =====================");
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("Apple");
        aggregate.add("Amazon");
        aggregate.add("Tesla");
        System.out.println("聚合的内容有：");
        Iterator iterator = aggregate.getIterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.print(object.toString() + "\t");
        }
        System.out.println();
        System.out.println("-------");
        Object object = iterator.first();
        System.out.println("First: " + object.toString());
        System.out.println("==================== 行为型模式 8 : 迭代器模式（Iterator） Sample END =====================");
        System.out.println();

    }
}

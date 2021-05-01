package cn.geekhall.gof.structure.flyweight;

import java.util.HashMap;

/**
 * @author yiny
 * @Type FlyweightFactory.java
 * @Desc
 * @date 4/29/21 12:52 PM
 */
class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null){
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}

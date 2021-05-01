package cn.geekhall.gof.creation.singleton;

/**
 * @author yiny
 * @Type HungrySingleton.java
 * @Desc
 * @date 4/22/21 7:54 PM
 */
class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }
    static HungrySingleton getInstance(){
        return instance;
    }

}

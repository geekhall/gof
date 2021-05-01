package cn.geekhall.gof.creation.singleton;

/**
 * @author yiny
 * @Type LazySingleton.java
 * @Desc
 * @date 4/22/21 7:48 PM
 */
class LazySingleton {
    // 如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile
    private static volatile LazySingleton instance = null;

    // 私有化构造器，避免类在外部被实例化
    private LazySingleton() {
    }

    /**
     * 如果编写的是多线程程序，则不要删除代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
     * 若不删除可以保证线程安全，但是每次访问时都要同步，会影响性能，消耗更多的资源，这是懒汉式单例的缺点。
     * @return
     */
    static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}


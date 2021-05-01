## 
在 Java 中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，
只要实现它们的子类就可以编写观察者模式实例。

1. Observable类

Observable 类是抽象目标类，它有一个 Vector 向量，用于保存所有要通知的观察者对象，下面来介绍它最重要的 3 个方法。
* void addObserver(Observer o) 方法：用于将新的观察者对象添加到向量中。
* void notifyObservers(Object arg) 方法：调用向量中的所有观察者对象的 update() 方法，通知它们数据发生改变。通常越晚加入向量的观察者越先得到通知。
* void setChange() 方法：用来设置一个 boolean 类型的内部标志位，注明目标对象发生了变化。当它为真时，notifyObservers() 才会通知观察者。

2. Observer 接口
* Observer 接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，并调用 void update(Observable o,Object arg) 方法，进行相应的工作。

## 利用 Observable 类和 Observer 接口实现原油期货的观察者模式实例。

分析：当原油价格上涨时，空方伤心，多方高兴；当油价下跌时，空方高兴，多方伤心。
本实例中的抽象目标（Observable）类在 Java 中已经定义，
可以直接定义其子类，即原油期货（OilFutures）类，它是具体目标类，
该类中定义一个 SetPriCe(float price) 方法，
当原油数据发生变化时调用其父类的 notifyObservers(Object arg) 方法来通知所有观察者；

另外，本实例中的抽象观察者接口（Observer）在 Java 中已经定义，只要定义其子类，
即具体观察者类（包括多方类 Bull 和空方类 Bear），并实现 update(Observable o,Object arg) 方法即可。

![](https://yinyang.space/img/gof_observer_sample1.png)

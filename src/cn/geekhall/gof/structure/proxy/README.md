### 结构型模式 1 ： 代理模式（Proxy）
定义：由于某些原因需要给某对象提供一个代理以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。

代理模式的主要优点有：
* 代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用；
* 代理对象可以扩展目标对象的功能；
* 代理模式能将客户端与目标对象分离，在一定程度上降低了系统的耦合度，增加了程序的可扩展性

其主要缺点是：
* 代理模式会造成系统设计中类的数量增加
* 在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
* 增加了系统的复杂度；

**那么如何解决以上提到的缺点呢？答案是可以使用动态代理方式**

代理模式的主要角色如下。
* 抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
* 真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
* 代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。

根据代理的创建时期，代理模式分为静态代理和动态代理。
* 静态：由程序员创建代理类或特定工具自动生成源代码再对其编译，在程序运行前代理类的 .class 文件就已经存在了。
* 动态：在程序运行时，运用反射机制动态创建而成

静态代理模式：
![](https://yinyang.space/img/gof_proxy.png)

动态代理模式：

在前面介绍的代理模式中，代理类中包含了对真实主题的引用，这种方式存在两个缺点。
* 真实主题与代理主题一一对应，增加真实主题也要增加代理。
* 设计代理以前真实主题必须事先存在，不太灵活。采用动态代理模式可以解决以上问题，如 SpringAOP

* 动态代理的代理类是动态生成的，不是事先直接写好的。
* 动态代理分为两大类：基于接口的动态代理，和基于类的动态代理。

需要了解两个类：Proxy(代理类)， InvocationHandler（调用处理程序）



![](https://yinyang.space/img/gof_dynamic_proxy.png)

应用场景：
* 切换数据源
* JDK
* Spring的AOP底层
* MyBatis源码中

生活中的实例：
* 结婚找中介帮忙筹备婚礼
* 找房产中介帮忙租房

# gof
程序设计的七大原则以及GoF的23种设计模式的Java代码实现

# 1. 软件设计的七大原则

## Principle 1 : 开闭原则（Open Close Principle, OCP）

内容：对扩展开放，对修改关闭
实现方式： 抽象约束，封装变化
具体实例： Windows主题、网站主题，抽象主题的共同特点为抽象类，
将每个具体主题作为其子类，用户可根据需要选择或者增加新的主题而不需要修改源码。
所以它满足开闭原则


## Principle 2 : 里氏替换原则(Liskov Substitution Principle, LSP)
内容： 继承必须确保超类所拥有的性质在子类中仍然成立，主要阐述了有关继承的一些原则，也就是什么时候应该使用继承，什么时候不应该使用继承，

实现方式：
* 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
* 子类中可以增加自己特有的方法
* 当子类的方法重载父类的方法时，方法的前置条件（即方法的输入参数）要比父类的方法更宽松
* 当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的的输出/返回值）要比父类的方法更严格或相等

具体实例：
* 几维鸟不是鸟
* 正方形不是长方形

## Principle 3 : 依赖倒置原则 (Dependence Inversion Principle, DIP)
内容：高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象

其核心思想是：要面向接口编程，不要面向实现编程

依赖倒置原则是实现开闭原则的重要途径之一，它降低了客户与实现模块之间的耦合。

作用：
* 依赖倒置原则可以降低类间的耦合性。
* 依赖倒置原则可以提高系统的稳定性。
* 依赖倒置原则可以减少并行开发引起的风险。
* 依赖倒置原则可以提高代码的可读性和可维护性。

实现方法：面向接口编程
1. 每个类尽量提供接口或抽象类，或者两者都具备。
2. 变量的声明类型尽量是接口或者是抽象类。
3. 任何类都不应该从具体类派生。
4. 使用继承时尽量遵循里氏替换原则。



## Principle 4 : 单一职责原则 (Single Responsibility Principle, SRP)
主要内容：一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分

对象不应该承担太多职责，如果一个对象承担了太多的职责，至少存在以下两个缺点：
1. 一个职责的变化可能会削弱或者抑制这个类实现其他职责的能力；
2. 当客户端需要该对象的某一个职责时，不得不将其他不需要的职责全都包含进来，从而造成冗余代码或代码的浪费。

优点：

单一职责原则的核心就是控制类的粒度大小、将对象解耦、提高其内聚性。如果遵循单一职责原则将有以下优点。
* 降低类的复杂度。一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多。
* 提高类的可读性。复杂性降低，自然其可读性会提高。
* 提高系统的可维护性。可读性提高，那自然更容易维护了。
* 变更引起的风险降低。变更是必然的，如果单一职责原则遵守得好，当修改一个功能时，可以显著降低对其他功能的影响。

接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化


## Principle 5 : 接口隔离原则（Interface Segregation Principle, ISP）
内容：要求程序员尽量将臃肿庞大的接口拆分成更小的和更具体的接口，让接口中只包含客户感兴趣的方法。

定义：客户端不应该被迫依赖于它不使用的方法

定义：一个类对另一个类的依赖应该建立在最小的接口上

含义：要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口供所有依赖它的类去调用。

优点：
* 将臃肿庞大的接口分解为多个粒度小的接口，可以预防外来变更的扩散，提高系统的灵活性和可维护性。
* 接口隔离提高了系统的内聚性，减少了对外交互，降低了系统的耦合性。
* 如果接口的粒度大小定义合理，能够保证系统的稳定性；但是，如果定义过小，则会造成接口数量过多，使设计复杂化；如果定义太大，灵活性降低，无法提供定制服务，给整体项目带来无法预料的风险。
* 使用多个专门的接口还能够体现对象的层次，因为可以通过接口的继承，实现对总接口的定义。
* 能减少项目工程中的代码冗余。过大的大接口里面通常放置许多不用的方法，当实现这个接口的时候，被迫设计冗余的代码。

实例：
学生成绩管理程序一般包含插入成绩、删除成绩、修改成绩、计算总分、计算均分、打印成绩信息、査询成绩信息等功能，
如果将这些功能全部放到一个接口中显然不太合理，正确的做法是将它们分别放在输入模块、统计模块和打印模块等 3 个模块中，


## Principle 6 : 迪米特法则（Least Knowledge Principle， LKP）
内容：又叫做最少知识原则。只与你的直接朋友交谈，不跟“陌生人”说话。

含义：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。

例子：
分析：明星由于全身心投入艺术，所以许多日常事务由经纪人负责处理，如与粉丝的见面会，
与媒体公司的业务洽淡等。这里的经纪人是明星的朋友，而粉丝和媒体公司是陌生人，所以适合使用迪米特法则


## Principle 7 : 合成复用原则（Composite Reuse Principle, CRP)
内容： 又叫组合/聚合复用原则，它要求软件在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。

如果要使用继承关系，则必须严格遵循里氏替换原则。合成复用原则同里氏替换原则相辅相成的，两者都是开闭原则的具体实现规范。


重要性：

通常类的复用分为继承复用和合成复用两种，继承复用虽然有简单和易实现的优点，但它也存在以下缺点。
1. 继承复用破坏了类的封装性。因为继承会将父类的实现细节暴露给子类，父类对子类是透明的，所以这种复用又称为“白箱”复用。
2. 子类与父类的耦合度高。父类的实现的任何改变都会导致子类的实现发生变化，这不利于类的扩展与维护。
3. 它限制了复用的灵活性。从父类继承而来的实现是静态的，在编译时已经定义，所以在运行时不可能发生变化。

采用组合或聚合复用时，可以将已有对象纳入新对象中，使之成为新对象的一部分，新对象可以调用已有对象的功能，它有以下优点。
1. 它维持了类的封装性。因为成分对象的内部细节是新对象看不见的，所以这种复用又称为“黑箱”复用。
2. 新旧类之间的耦合度低。这种复用所需的依赖较少，新对象存取成分对象的唯一方法是通过成分对象的接口。
3. 复用的灵活性高。这种复用可以在运行时动态进行，新对象可以动态地引用与成分对象类型相同的对象。

实现方法：

**合成复用原则是通过将已有的对象纳入新对象中，作为新对象的成员对象来实现的，新对象可以调用已有对象的功能，从而达到复用。**



## 一句话总结软件设计的七大原则
| 设计原则 | 一句话归纳 | 目的 |
| ---- | ---- | ---- |
| 开闭原则 | 对扩展开放，对修改关闭 | 降低维护带来的新风险 |
| 依赖倒置原则 | 高层不应该依赖低层，要面向接口编程 | 更利于代码结构的升级扩展 |
| 单一接口原则 | 一个类只干一件事，实现类要单一 | 便于理解，提高代码的可读性 |
| 接口隔离原则 | 一个接口只干一件事，接口要精简单一 | 功能解耦，高聚合、低耦合 |
| 迪米特法则 | 不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度 | 只和朋友交流，不和陌生人说话，减少代码臃肿 |
| 里氏替换原则 | 不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义 | 防止继承泛滥 |
| 合成复用原则 | 尽量使用组合或者聚合关系实现代码复用，少使用继承 | 降低代码耦合 |

记忆口诀：访问加限制，函数要节俭，依赖不允许，动态加接口，父类要抽象，扩展不更改。



## 创建型模式
1. 单例模式（Singleton）：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
2. 原型模式（Prototype）：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
3. 工厂方法模式（FactoryMethod）：定义一个用于创建产品的接口，由子类决定生产什么产品。
4. 抽象工厂模式（AbstractFactory)：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
5. 建造者模式 (Builder)：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。


## 结构型模式

1. 代理（Proxy）模式：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
2. 适配器（Adapter）模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
3. 桥接（Bridge）模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现的，从而降低了抽象和实现这两个可变维度的耦合度。
4. 装饰（Decorator）模式：动态地给对象增加一些职责，即增加其额外的功能。
5. 外观（Facade）模式：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。
6. 享元（Flyweight）模式：运用共享技术来有效地支持大量细粒度对象的复用。
7. 组合（Composite）模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。

## 行为型模式
1. 模板方法（Template Method）模式：定义一个操作中的算法骨架，将算法的一些步骤延迟到子类中，使得子类在可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
2. 策略（Strategy）模式：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
3. 命令（Command）模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
4. 职责链（Chain of Responsibility）模式：把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。
5. 状态（State）模式：允许一个对象在其内部状态发生改变时改变其行为能力。
6. 观察者（Observer）模式：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。
7. 中介者（Mediator）模式：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。
8. 迭代器（Iterator）模式：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
9. 访问者（Visitor）模式：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
10. 备忘录（Memento）模式：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
11. 解释器（Interpreter）模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。


### 创建型模式 1. 单例模式（Singleton）
定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式
单例模式的优点：
1. 单例模式可以保证内存里只有一个实例，减少了内存的开销。
2. 可以避免对资源的多重占用。
3. 单例模式设置全局访问点，可以优化和共享资源的访问。

单例模式的缺点：
1. 单例模式一般没有接口，扩展困难。如果要扩展，则除了修改原来的代码，没有第二种途径，违背开闭原则。
2. 在并发测试中，单例模式不利于代码调试。在调试过程中，如果单例中的代码没有执行完，也不能模拟生成一个新的对象。
3. 单例模式的功能代码通常写在一个类中，如果功能设计不合理，则很容易违背单一职责原则。

应用场景
* 需要频繁创建的一些类，使用单例可以降低系统的内存压力，减少 GC。
* 某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
* 某些类创建实例时占用资源较多，或实例化耗时较长，且经常使用。
* 某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
* 频繁访问数据库或文件的对象。
* 对于一些控制硬件级别的操作，或者从系统上来讲应当是单一控制逻辑的操作，如果有多个实例，则系统会完全乱套。
* 当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。


### 创建型模式 2. 原型模式（Prototype）
定义：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象

原型模式的优点：
* Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
* 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。

原型模式的缺点：
* 需要为每一个类都配置一个 clone 方法
* clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。


实现：
原型模式包含以下主要角色。
1. 抽象原型类：规定了具体原型对象必须实现的接口。
2. 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
3. 访问类：使用具体原型类中的 clone() 方法来复制新的对象。


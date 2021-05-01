## 模版方法的扩展
在模板方法模式中，基本方法包含：抽象方法、具体方法和钩子方法，正确使用“钩子方法”可以使得子类控制父类的行为。如下面例子中，可以通过在具体子类中重写钩子方法 HookMethod1() 和 HookMethod2() 来改变抽象父类中的运行结果，其结构图如下图所示：
![](https://yinyang.space/img/gof_template_method_sample2.png)



package cn.geekhall.basic.reflaction;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author yiny
 * @Type ReflactionSample.java
 * @Desc
 * @date 4/24/21 3:07 PM
 */
public class ReflactionSample {
    public static void execute() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("==================== Java基础 : 反射（Reflation） Sample START =====================");
        //=================================================================================
        // 1. 通过反射来获取Class对象。
        //=================================================================================

        /**
         * 正常生成对象方式
         */
        Employee employee = new Employee("埃隆.马斯克", "50", "吹牛皮", 1, "CEO", 1000000);

        /**
         * 反射的第一种方式： 通过Class.forName 方式获取Class对象。
         */
        Class c1 = Class.forName("cn.geekhall.basic.reflaction.Employee");


        /**
         * 反射的第二种方式： 通过类获取Class对象。
         */
        Class c2 = Employee.class;

        /**
         * 反射的第三种方式： 通过调用对象的getClass() 方法获取Class对象。
         */
        Class c3 = employee.getClass();

        /**
         * 可以通过==比较Class对象是否为同一个对象。
         */
        if (c1 == c2 && c1 == c3) {
            System.out.println("c1、c2、c3为同一个对象。");
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
        }


        //=================================================================================
        // 2. 通过反射来获取创建实例。
        //=================================================================================
        /**
         * 通过反射来获取实例的第一种方式：调用Class对象的newInstance()方法。
         */
        Class personClass = Person.class;
        Person p = (Person) personClass.newInstance();
        System.out.println(p);

        /**
         * 通过反射来获取实例的第二种方式：先通过Class对象获取指定的Constructor对象，
         * 再调用Constructor的newInstance()方法来创建实例。
         */
        Constructor constructor = personClass.getConstructor(String.class, String.class, String.class);
        Person p2 = (Person) constructor.newInstance("小明", "2", "3");
        System.out.println(p2);


        //=================================================================================
        // 3. 获取累的全部信息。
        //=================================================================================

        // 获取类名：String getName()
        String name = "cn.geekhall.basic.reflaction.Employee";
        Class classA = Class.forName(name);
        Class superClass = classA.getSuperclass();
        String modifiers = Modifier.toString(classA.getModifiers());
        System.out.println("------------ generated code start ----------------");
        if (modifiers.length() > 0) {
            System.out.print(modifiers + " ");
        }
        System.out.println("class " + name);

        if (superClass != null && superClass != Object.class) {
            System.out.println(" extends " + superClass.getName());
        }
        System.out.println("\n{");
        printConstructors(classA);
        System.out.println();
        printMethods(classA);
        System.out.println();
        printFields(classA);
        System.out.println("}");

        System.out.println("------------ generated code end ----------------");

        //=================================================================================
        // 4. 查看对象数据域实际内容程序。
        //=================================================================================
        int size = 4;
        ArrayList<Integer> squares = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            squares.add(i * i);
        }
        ObjectAnalyzer objectAnalyzer = new ObjectAnalyzer();
        System.out.println(objectAnalyzer.toString(squares));

        System.out.println(objectAnalyzer.toString(employee));

        //=================================================================================
        // 5. 调用任意方法相关的API。
        //=================================================================================
        Method sayHello = employee.getClass().getMethod("sayHello");
        System.out.println(sayHello);
        sayHello.invoke(employee);

        System.out.println("==================== Java基础 : 反射（Reflation） Sample START =====================\n");
    }

    /**
     * 打印对象的所有构造方法
     *
     * @param clz
     */
    public static void printConstructors(Class clz) {
        Constructor[] constructors = clz.getDeclaredConstructors();

        for (Constructor c : constructors) {
            String name = c.getName();
            System.out.print("    ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");

            // 打印构造参数
            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 打印Class的所有方法
     */
    public static void printMethods(Class clz) {
        Method[] methods = clz.getMethods();
        for (Method m : methods) {
//            System.out.println(m);
            Class retType = m.getReturnType();
            System.out.print("    ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + m.getName() + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 打印Class的所有属性
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            Class type = f.getType();
            System.out.print("    ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + f.getName() + ";");
        }
    }
}

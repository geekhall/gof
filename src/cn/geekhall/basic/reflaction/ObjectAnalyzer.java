package cn.geekhall.basic.reflaction;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @author yiny
 * @Type ObjectAnalyzer.java
 * @Desc
 * @date 4/24/21 4:43 PM
 */
class ObjectAnalyzer {

    private ArrayList<Object> visited = new ArrayList<>();

    String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (visited.contains(obj)) {    // 如果该对象已经处理过，则不再处理
            return "...";
        }
        visited.add(obj);

        Class cl = obj.getClass(); // 获取Class对象
        if (cl == String.class) {   // 如果是String类型则直接转为String
            return (String) obj;
        }
        if (cl.isArray()) {        // 如果是数组
            String r = cl.getComponentType() + "[]{\n";     // 数组的元素的类型
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {   // 不是数组的第一个元素加逗号和换行，显示更加美观
                    r += ",\n";
                }
                r += "\t";
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) { // Class为8种基本类型的时候为 true，直接输出
                    r += val;
                } else {
                    r += toString(val); // 不是8中基本类型时，说明是类，递归调用toString
                }
            }
            return r + "\n}";
        }
        // 既不是String，也不是数组时，输出该对象的类型和属性值
        StringBuilder r = new StringBuilder(cl.getName());
        do {
            r.append("[");
            Field[] fields = cl.getDeclaredFields();    // 获取该类自己定义的所有域，包括私有的，不包括父类的
            AccessibleObject.setAccessible(fields, true); // 访问私有的属性，需要打开这个设置，否则会报非法访问异常
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) { // 通过 Modifier 可获取该域的修饰符，这里判断是否为 static
                    if (!r.toString().endsWith("[")) {
                        r.append(",");
                    }
                    r.append(f.getName()).append("=");     // 域名称
                    try {
                        Class t = f.getType();  // 域（属性）的类型
                        Object val = f.get(obj);   // 获取obj对象上该域的实际值
                        if (t.isPrimitive()) {     // 如果类型为8种基本类型，则直接输出
                            r.append(val);
                        } else {
                            r.append(toString(val));     // 不是8种基本类型，递归调用toString
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r.append("]");
            cl = cl.getSuperclass(); // 继续打印超类的类信息
        } while (cl != null);
        return r.toString();
    }
}


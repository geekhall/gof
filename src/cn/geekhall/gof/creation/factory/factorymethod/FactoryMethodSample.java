package cn.geekhall.gof.creation.factory.factorymethod;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author yiny
 * @Type FactoryMethodSample.java
 * @Desc 读取XML配置文件中配置的类名，再通过反射机制实现不修改代码生成具体产品。
 * @date 4/23/21 9:20 PM
 */
public class FactoryMethodSample {
    public static void execute() {
        System.out.println("==================== 创建型模式 3 : 工厂方法模式（FactoryMethod） Sample START =====================");
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/cn/geekhall/gof/creation/factory/factorymethod/factoryConfig.xml"));
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            System.out.println(classNode.getNodeValue());
            String cName = "cn.geekhall.gof.creation.factory.factorymethod." + classNode.getNodeValue();
            Class<?> c = Class.forName(cName);
            AbstractFactory factory = (AbstractFactory)c.newInstance();
            Product product = factory.newProduct();
            product.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("==================== 创建型模式 3 : 工厂方法模式（FactoryMethod） Sample END =====================\n");
    }
}

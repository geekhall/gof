package cn.geekhall.gof.creation.factory.simplefactory;

/**
 * @author yiny
 * @Type SimpleFactorySample.java
 * @Desc
 * @date 4/23/21 8:54 PM
 */
public class SimpleFactorySample {
    public static void execute(){
        System.out.println("==================== 创建型模式 3 : 简单工厂模式（Simple Factory） Sample START =====================");
        Product productA = SimpleFactory.makeProduct(Const.PRODUCT_A);
        productA.show();
        Product productB = SimpleFactory.makeProduct(Const.PRODUCT_B);
        productB.show();

        System.out.println("==================== 创建型模式 3 : 简单工厂模式（Simple Factory） Sample END =====================\n");
    }
}

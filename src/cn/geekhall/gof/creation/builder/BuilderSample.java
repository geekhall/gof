package cn.geekhall.gof.creation.builder;

/**
 * @author yiny
 * @Type BuilderSample.java
 * @Desc
 * @date 4/24/21 11:43 AM
 */
public class BuilderSample {
    public static void execute(){
        System.out.println("==================== 创建型模式 4 : 建造者模式（Builder） Sample START =====================");
        Builder apple = new ConcreteBuilderApple();
        Director appleDirector = new Director(apple);
        Computer mbp = appleDirector.construct();
        mbp.show();

        Builder microsoft = new ConcreteBuilderMicrosoft();
        Director microsoftDirector = new Director(microsoft);
        Computer surface = microsoftDirector.construct();
        surface.show();

        System.out.println("==================== 创建型模式 4 : 建造者模式（Builder） Sample END =====================\n");
    }
}

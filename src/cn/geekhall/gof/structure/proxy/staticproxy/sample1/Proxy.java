package cn.geekhall.gof.structure.proxy.staticproxy.sample1;

/**
 * @author yiny
 * @Type Proxy.java
 * @Desc
 * @date 4/24/21 10:00 PM
 */
public class Proxy implements Rent{
    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }


    @Override
    public void rent() {
        seeHouse();
        makeContract();
        landlord.rent();
        charge(500);
    }

    /**
     * 看房子
     */
    void seeHouse(){
        System.out.println("中介带你看房子");
    }

    /**
     * 签合同
     */
    void makeContract(){
        System.out.println("签合同");
    }

    /**
     * 收中介费
     */
    void charge(double cost){
        System.out.println("收中介费， 价格： " + cost);
    }
}

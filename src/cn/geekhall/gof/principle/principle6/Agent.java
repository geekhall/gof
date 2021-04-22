package cn.geekhall.gof.principle.principle6;

/**
 * @author yiny
 * @Type Agent.java
 * @Desc
 * @date 4/22/21 12:43 PM
 */
public class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;

    public void setMyStar(Star myStar) {
        this.myStar = myStar;
    }

    public void setMyFans(Fans myFans) {
        this.myFans = myFans;
    }

    public void setMyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    public void meeting(){
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面。");
    }

    public void business(){
        System.out.println(myCompany.getName() + "与明星" + myStar.getName() + "洽谈业务。");
    }


}

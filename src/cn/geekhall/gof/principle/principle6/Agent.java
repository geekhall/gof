package cn.geekhall.gof.principle.principle6;

/**
 * @author yiny
 * @Type Agent.java
 * @Desc
 * @date 4/22/21 12:43 PM
 */
class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;

    void setMyStar(Star myStar) {
        this.myStar = myStar;
    }

    void setMyFans(Fans myFans) {
        this.myFans = myFans;
    }

    void setMyCompany(Company myCompany) {
        this.myCompany = myCompany;
    }

    void meeting(){
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面。");
    }

    void business(){
        System.out.println(myCompany.getName() + "与明星" + myStar.getName() + "洽谈业务。");
    }


}

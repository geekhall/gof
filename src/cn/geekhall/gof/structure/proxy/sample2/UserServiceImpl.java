package cn.geekhall.gof.structure.proxy.sample2;

/**
 * @author yiny
 * @Type UserServiceImpl.java
 * @Desc
 * @date 4/24/21 10:26 PM
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改了一个用户");

    }

    @Override
    public void query() {
        System.out.println("删除了一个用户");
    }
}

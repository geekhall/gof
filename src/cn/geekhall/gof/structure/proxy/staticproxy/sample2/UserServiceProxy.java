package cn.geekhall.gof.structure.proxy.staticproxy.sample2;

/**
 * @author yiny
 * @Type UserServiceProxy.java
 * @Desc
 * @date 4/24/21 10:28 PM
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    void log(String msg) {
        System.out.println("[DEBUG] 使用了" + msg + "方法");
    }
}

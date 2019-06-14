package 网站共享代码;

public class ConcreteWebSite extends WebSite {//具体网站
    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站分类：" + name + "  用户：" + user.getName());
    }
}

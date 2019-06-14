package 网站共享代码;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory f = new WebSiteFactory();
        WebSite fs = f.GetWebSiteCategory("产品展示");
        fs.Use(new User("小菜"));

        WebSite fs1 = f.GetWebSiteCategory("产品展示");
        fs1.Use(new User("大鸟"));

        WebSite fs2 = f.GetWebSiteCategory("产品展示");
        fs2.Use(new User("娇娇"));

        WebSite f1 = f.GetWebSiteCategory("博客");
        f1.Use(new User("老顽童"));

        WebSite f2 = f.GetWebSiteCategory("博客");
        f2.Use(new User("桃谷六仙"));

        System.out.println("网站分类总数为" + f.GetWebSiteCount());
    }
}

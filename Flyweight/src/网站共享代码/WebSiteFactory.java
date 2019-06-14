package 网站共享代码;

import java.util.Hashtable;

public class WebSiteFactory { //网站工厂
    private Hashtable flyweights=new Hashtable();
//获得网站分类
    public WebSite GetWebSiteCategory(String key){
        if(!flyweights.containsKey(key))
            flyweights.put(key,new ConcreteWebSite(key));
        return (WebSite) flyweights.get(key);
    }
//获得网站分类总数
    public  int GetWebSiteCount(){
        return  flyweights.size();
    }
}

package cn.edu.designpattern.flyweight;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/4 10:18
 * @Description: 网站工厂类 根据需求 返回一个网站
 */
public class WebsiteFactory {
    // 使用一个集合 充当池的作用：
    private HashMap<String, ConcreteWebsite> siteMap = new HashMap<>();
    // 根据网站的类型 返回一个网站 如果没有就创建一个网站 并放到池中

    public Website getWebsite(String type){
        if (!siteMap.containsKey(type)){
            // 没有就创建 返回
            siteMap.put(type, new ConcreteWebsite(type));
        }
        return siteMap.get(type);
    }
    public int getWebsiteCount(){
        return siteMap.size();
    }
}

package cn.edu.designpattern.flyweight;

import java.util.HashMap;

/**
 * @Author: DDG
 * @Date: 2020/5/4 10:29
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 获取website 享元模式： 就是将相同的状态进行共用 也就是内部状态的共用
        // 享元模式： 就是 享就是共享  元就是 对象  也就是内部状态 享元模式 也叫做是 蝇量模式
        // 享元模式最重要的就是分析出来 内部状态 和外部状态
        WebsiteFactory websiteFactory = new WebsiteFactory();
        // 新闻形式
        Website website = websiteFactory.getWebsite("新闻");
        // 使用
        website.use(new User("张三"));
        // 其他的形式：
        Website website1 = websiteFactory.getWebsite("博客");
        website1.use(new User("张三1"));
        Website website2 = websiteFactory.getWebsite("博客");
        website1.use(new User("张三2"));
        Website website3 = websiteFactory.getWebsite("博客");
        website1.use(new User("张三3"));
        System.out.println(websiteFactory.getWebsiteCount());

        Integer.valueOf(123); // Integer 中的 cache 就是 一个静态数组 -128 127
        // 在这个区间内 都是使用的是缓存 要是不在 就是创建一个新的对象 使用的就是享元模式

        HashMap<Long, Boolean> longBooleanHashMap = new HashMap<>();
        Boolean aBoolean = longBooleanHashMap.get(1);
        System.out.println(aBoolean);


    }
}

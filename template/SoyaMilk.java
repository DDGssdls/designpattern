package cn.edu.designpattern.template;

/**
 * @Author: DDG
 * @Date: 2020/5/5 09:37
 * @Description:
 */
public abstract class SoyaMilk {

    public final void make(){// 使用final进行修饰 防止子类重写 覆盖方法
        select();
        if (isAdd()){
            add();
        }
        soak();
        beat();
    }
    private void select(){
        System.out.println("进行黄豆的选择");
    }
    private void soak(){
        System.out.println("进行黄豆的浸泡");
    }
    private void beat(){
        System.out.println("进行黄豆的打碎");
    }
    // 钩子函数
    public boolean isAdd(){
        return true;
    }

    public abstract void add();
}

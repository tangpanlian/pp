package hcnu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add(888.3F);
        set.add(false);
        set.add(1);
        set.add(2);

        System.out.println("当前集合的元素个数：" + set.size());//似乎不算重复的
    }
}

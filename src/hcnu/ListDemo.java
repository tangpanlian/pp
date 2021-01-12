package hcnu;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(888.22F);
        list.add(false);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("集合元素个数："+list.size());
    }
}

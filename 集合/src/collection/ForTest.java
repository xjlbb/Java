package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * jdk 5.0 新增foreach循环，用于遍历集合、数组
 *
 * @author xujiale
 * @date 2021/8/24 16:50
 */

public class ForTest {

    @Test
    public void test(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom", 22));
        coll.add(new String("BB"));

        //for(集合元素的类型 局部变量 ：集合对象)
        //内部仍然调用了迭代器
        for (Object obj : coll
             ) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};

        for (int i:arr
             ) {
            System.out.println(i);
        }
    }
}

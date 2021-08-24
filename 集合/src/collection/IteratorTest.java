package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 推荐：hashNext() 和 next()
 *
 * @author xujiale
 * @date 2021/8/24 16:25
 */

public class IteratorTest {

    @Test
    public void test(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom", 22));
        coll.add(new String("BB"));

        Iterator iterator = coll.iterator();

        //不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

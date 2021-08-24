package list;

import collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *      |----Collection接口,用来存储一个一个的对象
 *          |----List接口：有序的、可重复的数据。
 *              |----ArrayList：作为List接口的主要实现类；线程不安全，效率高；底层使用Object[] elementData存储
 *              |----LinkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用双向链表存储
 *              |----Vector：作为List接口的古老实现类；线程安全，效率低；底层使用Object[] elementData存储
 *
 *  面试题：ArrayList、LinkedList、Vector三者的异同？
 *  同：三个类都实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
 *  不同：参考上面
 *
 *  List接口中的常用方法
 *
 *
 * @author xujiale
 * @date 2021/8/24 19:12
 */

public class ListTest {

    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));

        System.out.println(list);

        //void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        //boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(1, 2, 3, 456);
        list.addAll(list1);
        System.out.println(list.size());
        System.out.println(list);

        //Object get(int index):获取指定index位置的元素
        System.out.println(list.get(0));

        //int indexOf(Object obj):返回obj在集合中首次出现的位置。如果不存在，返回-1
        System.out.println(list.indexOf(456));

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
        System.out.println(list.lastIndexOf(456));

        //Object remove(int index):移除指定index位置的元素，并返回此元素
        System.out.println(list.remove(6));
        System.out.println(list);

        //Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(1, "CC");

        //List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的 左闭右开 子集合
        System.out.println(list.subList(2,4));
    }
}

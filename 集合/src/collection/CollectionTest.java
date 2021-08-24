package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * 一、集合框架的概述
 *
 * 1.集合、数组都是对多个数据进行存储操作的结构，简称Java容器。
 *  说明：此时的存储，主要指得是内存层面的存储，不涉及到持久化的存储(.txt, .jpg, avi, 数据库中)
 *
 * 2.1 数组在存储多个数据方面的特点：
 *      > 一旦初始化，其长度就确定了
 *      > 数组一旦定义好，其元素的类型也就确定了。
 *      比如：int[] arr1;
 * 2.2 数组在存储多个数据方面的缺点：
 *      > 一旦初始化，其长度就不能修改
 *      > 数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，同时效率不高。
 *      > 获取数组中实际元素的个数的需求，数组没有线程的属性或方法可用
 *      > 数组存储数据的特点：有序、可重复。对于无序、不重复的需求，不能满足。
 *
 * 二、集合框架
 *      |----Collection接口
 *          |----List接口：有序的、可重复的数据。
 *              |----ArrayList、LinkedList、Vector
 *          |----Set接口： 无序的、不可重复的数据。
 *              |----HashSet、LinkedHashSet、TreeSet
 *
 *      |----Map接口
 *              |----HashMap、LinkedHashMap、TreeMap、Hashtable、Properties
 *
 * @author xujiale
 * @date 2021/8/24 14:20
 */

public class CollectionTest {

    //测试Collection接口的方法
    @Test
    public void test1(){
        Collection coll = new ArrayList();

        //add(Object e);将元素e添加到集合coll中
        coll.add("aa");
        coll.add("bb");
        coll.add(123);//自动装箱
        coll.add(new Date());
        coll.add(new Person("jerry",20));

        //contains(Object obj); 判断当前集合中是否包含obj
        System.out.println(coll.contains(123));

        //remove(Object obj);移除
        coll.remove(123);

        //size();获取添加元素的个数
        System.out.println(coll.size());// 4

        //addAll(Collection coll1); 将coll1集合中的元素添加到当前的集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("cc");
        coll.addAll(coll1);

        System.out.println(coll.size());// 6
        System.out.println(coll);

        //clear(); 清空集合元素
        coll.clear();

        //isEmpty(); 判断当前集合是否为空
        System.out.println(coll.isEmpty());

    }

    @Test
    public void test2(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Tom", 22));
        coll.add(new String("BB"));

        //hashCode();返回当前对象的哈希值
        System.out.println(coll.hashCode());
    }
}

package test;

import org.junit.Test;

/**
 *
 * 一、异常体系架构
 *
 * java.lang.Throwable
 *      |----java.lang.Error
 *      |----java.lang.Exception: 可以进行异常处理
 *          |----编译时异常(checked)
 *              |----IOException
 *                  |----FileNotFoundException
 *              |----ClassNotFoundException
 *          |----运行时异常(unchecked) -> RuntimeException
 *              |----NullPointerException 空指针异常
 *              |----ArrayIndexOutOfBoundsException
 *              ................
 *
 * @author xujiale
 * @date 2021/9/4 12:39
 */

public class ExceptionTest {

    //NullPointerException 空指针异常
    @Test
    public void test1(){
        String str = null ;
        System.out.println(str.charAt(1));
    }


}

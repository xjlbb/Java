/**
 * 测试Thread中的常用方法：
 * 1.start():启动当前线程；调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程
 * 4.getName():获取当前线程的名字
 * 5.setName():设置当前线程的名字
 * 6.yield():释放当前cpu的执行权
 * 7.join():在线程a中调用线程b的join(),此时线程a就进入阻塞状态，直到线程b完全执行完以后，线程a才结束阻塞状态。
 * 8.sleep(long millitime):让当前线程“睡眠”指定的millitime毫秒。在指定的millitime毫秒时间内，当前线程是阻塞状态
 * 9.isAlive():判断当前线程是否存活
 *
 * 线程的优先级：
 * 1.
 * NORM_PRIORITY:5 -> 默认优先级
 * MAX_PRIORITY:10
 * MIN_PRIORITY:1
 * 2.如何获取和设置当前线程的优先级：
 * getPriority() : 返回线程优先级
 * setPriority(int newPriority) : 改变线程的优先级
 *
 * 不确定，没屌用
 *
 * @author xujiale
 * @date 2021/8/20 13:35
 */

public class ThreadMethodTest {
    public static void main(String[] args) {

        Test test = new Test();

        test.setName("线程一");

        //设置分线程的优先级
        //test.setPriority(Thread.MAX_PRIORITY);

        test.start();

        Thread.currentThread().setName("主线程：");

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }

            if (i == 20){
                try {
                    test.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(test.isAlive());
    }
}

class Test extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){

                try {
                    sleep(10);//单位:ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
            }

        }
    }
}

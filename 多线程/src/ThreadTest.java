/**
 * 多线程的创建，方式一：继承于Thread类
 * 例子：遍历100以内所有的偶数
 */

public class ThreadTest{
    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThread myThread = new MyThread(); // new MyThread() -> alt enter

        //4.通过此对象调用start() 1.启动当前线程 2.调用当前线程的run()
        myThread.start();

        //如果直接调用run()，会是啥情况?
        //myThread.run();

        //如下操作仍是在main线程执行的
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName() +i);
            }
        }
    }

}

//1.创建一个继承于Thread类的子类
class MyThread extends Thread{

    //2.重写Thread类的run() -->将此线程执行的操作声明在run()中
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

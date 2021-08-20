package exer;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 *@author xujiale
 *@date 2021/8/20 11:26
 */

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
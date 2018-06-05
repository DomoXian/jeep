package com.leno.jeep.simple.deadLock;

/**
 * <p>死锁入口</p>
 *
 * @author: XianGuo
 * @date: 2018年06月04日
 */
public class DeadLockMain {

    public static void main(String[] args) {

        Object a = new Object();

        Object b = new Object();

        Thread threadA = new Thread(() -> {

            synchronized (a) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("输出a");
                synchronized (b) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("输出b");
                }
            }
        });

        Thread threadB = new Thread(() -> {

            synchronized (b) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("输出b");
                synchronized (a) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("输出a");
                }
            }
        });

        threadA.start();
        threadB.start();

    }


}

package com.leno.jeep.common.concurrent;

import com.leno.jeep.common.utils.ThreadPoolProvider;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>测试类</p>
 *
 * @author: XianGuo
 * @date: 2018年05月18日
 */
public class Atomic {


    /**
     * 假设有十个线程对 count++操作
     */
    public static void main(String[] args) {
        new AtomicDemo().add();


    }


    public static class AtomicDemo {


        private int count = 0;

        AtomicReference<Integer> atomic = new AtomicReference<>(count);


        public void add() {

            Lock lock = new ReentrantLock();
            for (int i = 0; i < 100; i++) {
                ThreadPoolProvider.getExecutor().submit(() -> {
                    for (int j = 0; j < 10; j++) {
                        lock.lock();
                        atomic.compareAndSet(count, count++);
                        lock.unlock();
                    }

                });
            }
            System.out.println(count);
        }
    }


}

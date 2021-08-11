package org.zjx.example;

import java.util.Vector;

/**
 *
 */
public class ThreadTest1 {
    public static void main(String[] args) throws InterruptedException {

        // region join方法

        // 在创建子线程后，马上启动子线程，然后join到主线程中，这样操作会让先创建的线程执行完之后，才开始创建第二个子线程
//        for (int i = 0; i < 5; i++) {
//            System.out.println("开始创建子线程");
//            int j = i;
//            Thread thread = new Thread(() -> {
//                System.out.println("-------线程" + j + ":开始执行----------");
//                try {
//                    Thread.sleep(1000 * (5-j));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("-------线程" + j + ":终止执行----------");
//            });
//            thread.start();
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("主线程结束");






        Thread thread1 = null;
        Thread thread2 = null;
        Thread thread3 = null;
        thread2 = new Thread(()->{
            System.out.println("-------线程" + 2 + ":开始执行----------");
            try {
                Thread.sleep(1000 * (5-2));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-------线程" + 2 + ":终止执行----------");
        });
        thread1 = new Thread(()->{
            System.out.println("-------线程" + 1 + ":开始执行----------");
            try {
                Thread.sleep(1000 * (5-1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-------线程" + 1 + ":终止执行----------");
        });

        thread3 = new Thread(()->{
            System.out.println("-------线程" + 3 + ":开始执行----------");
            try {
                Thread.sleep(1000 * 6);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-------线程" + 3 + ":终止执行----------");
        });

        thread2.start();
        thread1.start();
        thread3.start();
        thread2.join();
        thread1.join();
        System.out.println("22222");
        Thread.sleep(1000);
        thread3.join();

        System.out.println("主线程结束");










//        // 在内部创建子线程，在启动子线程后，将这些子线程添加到主线程中
//        // 结果：所有子线程同时执行，子线程全部执行完成后才结束主线程
//        // 虽然主线程被阻塞了，但是join方法还是可以继续加入
//        Vector<Thread> vector = new Vector<>();
//        for (int i = 0; i < 5; i++) {
//            int j = i;
//            Thread thread = new Thread(() -> {
//                System.out.println("-------线程" + j + ":开始执行----------");
//                try {
//                    Thread.sleep(1000 * (5-j));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println("-------线程" + j + ":终止执行----------");
//            });
//            vector.add(thread);
//            thread.start();
//        }
//        for (Thread item:
//             vector) {
//            try {
//                item.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("主线程结束");

        // endregion

    }
}

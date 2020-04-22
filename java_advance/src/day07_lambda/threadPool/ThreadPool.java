package day07_lambda.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yanyuchun on 2020/4/20
 */
/*
    线程池： JDK 1.5之后提供
    Executors类中的静态方法：
        static ExecutorService	newFixedThreadPool(int nThreads) 创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程。
        参数
            nThreads - 池中的线程数
        结果
            新创建的线程池
        异常
            IllegalArgumentException - 如果是 nThreads <= 0

    java.util.concurrent.ExecutorService 线程池接口
        用来从线程池中获取线程，调用start方法，执行线程任务
            submit(Runnable task) 提交一个可运行的任务执行，并返回一个表示该任务的未来。
        关闭线程池的方法
            void shutdown()
    使用线程池中线程对象的步骤：
        1、创建线程池对象。
        2、创建Runnable接口子类对象。(task)
        3、提交Runnable接口子类对象。(take task)
        4、关闭线程池(一般不做)。
 */
public class ThreadPool {
    public static void main(String[] args) {
        // 生成一个线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        // 调用submit方法，传递线程任务的实现类，开启线程
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        // 调用ExecutorService 中的方法shutdown来关闭线程
        es.shutdown();
        es.submit(new RunnableImpl());
    }

}

package day22_Threadd.demo11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 	线程池好处：线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。
 * 	
 * 	
 * 		如何实现线程的代码呢？
 * 			1.创建线程池对象，控制要创建几个线程对象
 * 				public static ExecutorService newFixedThreadPool(int nThreads)
 *			2.线程池的线程可以执行
 *				可以执行Runnable对象或者Callable对象代表的线程
 *			3.调用如下方法：
 *				Future<?> submit(Runnable task)
				<T> Future<T> submit(Callable<T> task)
 * 
 */
public class ExecutorsDemo {
	public static void main(String[] args) {
		// 创建线程池对象，控制要创建几个线程对象
		ExecutorService pool = Executors.newFixedThreadPool(2);

		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		// shutdown() 启动一次顺序关闭，执行以前提交的任务，但不接受新任务。
		// 结束线程池
		pool.shutdown();

	}
}

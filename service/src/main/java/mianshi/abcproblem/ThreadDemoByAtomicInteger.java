package mianshi.abcproblem;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 描述:
 * 多种方式打印ABC
 *
 * @author 郭启帆
 * @create 2019-03-02 21:35
 */
public class ThreadDemoByAtomicInteger  implements Runnable{
    private static AtomicInteger currentCount = new AtomicInteger(0);

    private static final Integer MAX_COUNT = 30;

    private static String [] chars = {"a", "b", "c"};

    private String name;

    public ThreadDemoByAtomicInteger(String name) {
        this.name =  name;
    }

    @Override
    public void run() {
        while(currentCount.get()<MAX_COUNT){
            if(this.name.equals(chars[currentCount.get()%3])){
                printAndPlusOne(this.name + "\t" + currentCount);
            }
        }
    }

    public void printAndPlusOne(String content){
        System.out.println(content);
        currentCount.getAndIncrement();
    }

    public static void main(String [] args){
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3,
                20, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());
        threadPoolExecutor.execute(new ThreadDemoByAtomicInteger("a"));
        threadPoolExecutor.execute(new ThreadDemoByAtomicInteger("b"));
        threadPoolExecutor.execute(new ThreadDemoByAtomicInteger("c"));
        threadPoolExecutor.shutdown();
    }
}

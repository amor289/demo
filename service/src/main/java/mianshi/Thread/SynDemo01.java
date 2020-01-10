package mianshi.Thread;

/**
 * 描述:
 *
 * @author 郭启帆
 * @create 2019-09-20 17:23
 */
public class SynDemo01 {
    public void say01() throws Exception {
        synchronized (this.getClass()) {
            for (int i = 0; i < 10; i++) {
                System.out.println("say1:" + i);
                Thread.sleep(100L);
            }
        }
    }

    public void say02() throws Exception {
        synchronized (this.getClass()) {
            for (int i = 0; i < 10; i++) {
                System.out.println("say2:" + i);
                Thread.sleep(100L);
            }
        }
    }

    public static void main(String[] args) {
        SynDemo01 demo01 = new SynDemo01();
        SynDemo01 demo02 = new SynDemo01();
        new Thread(() -> {
            try {
                demo01.say01();
            } catch (Exception ignored) {
            }
        }).start();
        new Thread(() -> {
            try {
                demo02.say02();
            } catch (Exception ignored) {
            }
        }).start();
    }
}

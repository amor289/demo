package mianshi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * 描述: 123,456,789 --> 147,258,369
 *
 * @author wb.guoqifan
 * @create 2019-08-19 15:29
 */
public class NumberProblem {
    private String[] outString = {};

    public String[] format(String[] numbers) throws ExecutionException, InterruptedException {
        int count = numbers.length;
        ExecutorService executorService = Executors.newFixedThreadPool(count);
        // 获取结果
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            FutureTask<String> f = new FutureTask<>(new GetChar(i, numbers));
            f.run();
            futures.add(f);
        }
        for (int i = 0; i < futures.size(); i++) {
            System.out.println(futures.get(i).get());
        }
        executorService.shutdown();
        return outString;

    }

    class GetChar implements Callable<String> {
        int pos;
        String[] numbers;

        public GetChar(int pos, String[] numbers) {
            this.pos = pos;
            this.numbers = numbers;
        }

        @Override
        public String call() throws Exception {
            StringBuffer stringBuffer = new StringBuffer();
            // 获取参数
            for (String number : numbers) {
                if (pos == 0) {
                    stringBuffer.append(number, 0, 1);
                }
                if (pos == 1) {
                    stringBuffer.append(number, 1, 2);
                }
                if (pos == 2) {
                    stringBuffer.append(number, 2, 3);
                }

            }
            return stringBuffer.toString();

        }
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] test = {"123", "456", "789"};
        new NumberProblem().format(test);
    }
}

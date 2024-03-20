package thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.TestCallable
 * @date ：Created in 2024/3/20 17:36
 * @description：
 * @modified By：
 * @version:
 */
public class TestCallable implements Callable<Boolean> {

    private String url;
    private String name;
    private final static String PREFIX = "resources/";

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        TestCallable.Downloader downloader = new TestCallable.Downloader();
        downloader.downloadFile(url,PREFIX+name);
        System.out.println("下载完成=======文件名:" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable st1 = new TestCallable("http://img.sccnn.com/bimg/341/35581.jpg","1.jpg");
        TestCallable st2 = new TestCallable("http://img.sccnn.com/bimg/341/35607.jpg","2.jpg");
        TestCallable st3 = new TestCallable("http://img.sccnn.com/bimg/341/35596.jpg","3.jpg");

        //线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        
        Future<Boolean> submit1 = executorService.submit(st1);
        Future<Boolean> submit2 = executorService.submit(st2);
        Future<Boolean> submit3 = executorService.submit(st3);

        Boolean a1 = submit1.get();
        Boolean a2 = submit2.get();
        Boolean a3 = submit3.get();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        //关闭
        executorService.shutdown();
    }

    class Downloader{
        public void downloadFile(String url,String name){
            try {
                FileUtils.copyURLToFile(new URL(url),new File(name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

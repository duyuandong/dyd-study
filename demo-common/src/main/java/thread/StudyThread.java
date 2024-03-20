package thread;

import org.apache.commons.io.FileUtils;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author ：duyd@segimail.com
 * @class ：thread.StudyThread
 * @date ：Created in 2024/3/20 15:25
 * @description：
 * @modified By：
 * @version:
 */
public class StudyThread implements Runnable{

    private String url;
    private String name;

    public StudyThread(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        DownloadFile downloadFile = new DownloadFile();
        downloadFile.downloadFile(url,name);
        System.out.println("下载完成=======文件名:" + name);
    }

    public static void main(String[] args) {
        StudyThread st1 = new StudyThread("http://img.sccnn.com/bimg/341/35581.jpg","resources/1.jpg");
        StudyThread st2 = new StudyThread("http://img.sccnn.com/bimg/341/35607.jpg","resources/2.jpg");
        StudyThread st3 = new StudyThread("http://img.sccnn.com/bimg/341/35596.jpg","resources/3.jpg");

        new Thread(st1).start();
        new Thread(st2).start();
        new Thread(st3).start();
    }

    class DownloadFile{
        private void downloadFile(String url,String name){
            try {
                FileUtils.copyURLToFile(new URL(url),new File(name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

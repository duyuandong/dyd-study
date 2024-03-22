package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：duyd@segimail.com
 * @class ：utils.DateUtils
 * @date ：Created in 2024/3/21 15:12
 * @description：
 * @modified By：
 * @version:
 */
public class DateUtils {
    private static boolean isSendMsg(int confDay, Date currentDate, Date expDate){
        long cs = currentDate.getTime() / 1000;
        long es = expDate.getTime() / 1000;
        int hours = (int) (( es - cs ) / 60 / 60);
        if(hours < confDay * 24 && hours > (confDay - 1) * 24){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws ParseException {
        String time = "2024年03月23 21:59:59";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        Date parse = sdf.parse(time);
        boolean sendMsg = isSendMsg(3, new Date(), parse);
        System.out.println(sendMsg);
    }
}

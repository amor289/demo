package timeUtil;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 描述:
 * java8时间
 *
 * @author 郭启帆
 * @create 2019-09-03 23:06
 */
public class TimeUtil {
    /**
     * 获取LocalTime时间
     *
     * @param time
     * @return
     */
    public static LocalTime timestamp2LocalTime(Long time) {
        if (null == time) {
            return null;
        }
        LocalDateTime localDateTime = TimeUtil.timestamp2LocalDateTime(time);
        return LocalTime.of(localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
    }

    /**
     * 获取LocalDateTime时间,当前默认时区
     *
     * @param time
     * @return
     */
    public static LocalDateTime timestamp2LocalDateTime(Long time) {
        if (null == time) {
            return null;
        }
        // 时间的转换
        Instant instant = Instant.ofEpochMilli(time);
        return LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }

    public static Long getPlusYear(int year) {
        return LocalDateTime.of(LocalDateTime.now().plusYears(year).toLocalDate(), LocalTime.MAX)
                .atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

}

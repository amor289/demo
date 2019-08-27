package task;

import java.util.Map;

public interface Itask<T,E> {

    /**
     *
     * 任务执行方法接口<BR>
     * 方法名：execute<BR>
     * @param e 传入对象
     * @param params 其他辅助参数
     * @return T<BR> 返回值类型
     * @exception <BR>
     * @since  2.0
     */
    T execute(E e, Map<String, Object> params);

}

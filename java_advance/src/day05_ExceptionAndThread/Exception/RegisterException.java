package day05_ExceptionAndThread.Exception;

/**
 * 自定义异常类：
 *      java提供的异常类，不够我们使用，需要自定义异常
 * 格式：
 *      public
 * 注意：
 *  1、自定义异常累一般都是以Exception结尾，说明该类是一个异常类
 *  2、自定义异常类，必须是继承Exception或者RuntimeException
 *      继承Exception：是编译期异常，必须呀处理
 *      继承RuntimeException：是运行期异常，不必要处理
 * Created by yanyuchun on 2020/4/10
 */
public class RegisterException extends RuntimeException{

    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}

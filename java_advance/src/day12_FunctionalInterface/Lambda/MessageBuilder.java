package day12_FunctionalInterface.Lambda;

/**
 * Created by yanyuchun on 2020/5/9
 */
@FunctionalInterface
public interface MessageBuilder {
    // 定义一个拼接消息的抽象方法
    public abstract String BuilderMessage();
}

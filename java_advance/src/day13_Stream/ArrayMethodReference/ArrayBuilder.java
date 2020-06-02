package day13_Stream.ArrayMethodReference;

/**
 * Created by yanyuchun on 2020/6/1
 * 定义一个创建数组的函数式接口
 */
@FunctionalInterface
public interface ArrayBuilder {
    // 定义一个创建int类型数组的方法，参数传递数组的长度，返回创建好的int类型数组
    int[] builderArray(int len);
}

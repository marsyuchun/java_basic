package day02_collection.generic;

/**
 * Created by yanyuchun on 2020/3/31
 */
public class Generic01<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public Generic01(E name) {
        this.name = name;
    }

//    public Generic01() {
//    }
}

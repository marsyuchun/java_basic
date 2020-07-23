package day02_collection.generic.strength;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by yanyuchun on 2020/7/10
 */
public class Safes {
    public static <T> T first(Collection<T> source) {
        if (source.isEmpty()) {
            return null;
        } else {
            T t = null;
            Iterator<T> iterator = source.iterator();
            if (iterator.hasNext()) {
                t = iterator.next();
            }

            return t;
        }
    }
}

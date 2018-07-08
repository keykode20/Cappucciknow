package co.uk.emilyo.common.util;

import java.util.function.Supplier;

/**
 * Created by Emilio on 08/07/2018.
 */
public class NullSafe {
    public static <T> T object(T t, Supplier<T> s){
        return t != null ? t : s.get();
    }

}

package enum_;

import java.util.HashMap;
import java.util.Map;

public enum Simple5 {
    ONE, TWO, THREE;

    static final Map<Integer, String> info;

    static {
        info = new HashMap<>();
        info.put(1, "FIRST");
        info.put(2, "SECOND");
    }

}

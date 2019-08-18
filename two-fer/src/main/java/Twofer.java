
import java.util.*;

import java.util.ArrayList;

class Twofer {
    String twofer(String name) {
        String result = String.format("One for %s, one for me.", (name != null ? name : "you"));
        return result;
    }


}

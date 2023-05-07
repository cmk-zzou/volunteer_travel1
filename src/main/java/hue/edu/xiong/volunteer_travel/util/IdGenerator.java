package hue.edu.xiong.volunteer_travel.util;

import java.util.UUID;

public class IdGenerator {

    public static String id() {

        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public static String ids() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

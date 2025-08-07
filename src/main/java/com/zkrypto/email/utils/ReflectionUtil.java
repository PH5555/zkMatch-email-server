package com.zkrypto.email.utils;

import java.lang.reflect.Field;

public class ReflectionUtil {
    public static void setter(Object object, String filedName, Object data) {
        try {
            Field field = object.getClass().getDeclaredField(filedName);
            field.setAccessible(true);
            field.set(object, data);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

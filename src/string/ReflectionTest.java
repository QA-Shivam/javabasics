package string;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        RefClass ref= new RefClass();
        Class<?> aClass=ref.getClass();
        Field uname= aClass.getDeclaredField("username");
        uname.setAccessible(true);
        System.out.println(uname.get(ref));
    }

}

package app;

import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) {
        Class<ArrayUtils> obj = ArrayUtils.class;


        Method[] methods = obj.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                assert methodInfo != null;
                System.out.println("Метод: " + methodInfo.name());
                System.out.println("Тип повернення: " + methodInfo.returnType());
                System.out.println("Опис: " + methodInfo.description());
                assert author != null;
                System.out.println("Автор: " + author.name() + " " + author.surname());
                System.out.println();
            }
        }
    }
}

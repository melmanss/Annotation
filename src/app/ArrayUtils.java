package app;

public class ArrayUtils {

    @MethodInfo(name = "sortArray", returnType = "int[]", description = "Сортує масив цілих чисел.")
    @Author(name = "Олександр", surname = "")
    @Version("1.0")
    public int[] sortArray(int[] array) {

        java.util.Arrays.sort(array);
        return array;
    }

    @MethodInfo(name = "findMax", returnType = "int", description = "Знаходить максимальне значення в масиві.")
    @Author(name = "Олександр", surname = "")
    @Version("1.1")
    public int findMax(int[] array) {

        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
